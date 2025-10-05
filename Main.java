// Main.java
// ------------------------------------------------------------------------------------
// ROLE: Driver that repeatedly asks which type of menu item to create (pizza/drink).
//       Demonstrates a while-loop with Scanner input, object construction based on
//       user choice, constructor overloading, and polymorphic display at the end.
//
// WEEK 5 GUARDRAILS:
//  - No ArrayList or List: uses a fixed-size array of MenuItem.
//  - No shorthand operators (no i++, no +=, no ternary in logic).
//  - Expanded blocks with end-of-block comments.
// ------------------------------------------------------------------------------------

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Fixed-size storage for created items
        final int MAX = 100;
        MenuItem[] items = new MenuItem[MAX];
        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("=== CSC 222: Menu Builder ===");
        System.out.println("Type 'pizza' to add a Pizza");
        System.out.println("Type 'drink' to add a Drink");
        System.out.println("Type 'quit'  to stop and display all items");
        System.out.println("-----------------------------------------");

        // Main input loop
        while (true) {

            String choice = prompt(sc, "Enter type (pizza/drink/quit): ").toLowerCase();

            if (choice.equals("quit")) {
                break;
            } // end if quit

            if (choice.equals("pizza")) {

                String name = prompt(sc, "Pizza name: ");
                double price = promptDouble(sc, "Price (e.g., 12.99): ");
                String size = prompt(sc, "Size (Small/Medium/Large): ");
                String crust = prompt(sc, "Crust type (Thin/Hand-Tossed/Deep Dish): ");
                String toppings = prompt(sc, "Toppings (comma-separated): ");

                Pizza p = new Pizza(name, price, size, crust, toppings);

                if (count < MAX) {
                    items[count] = p;
                    count = count + 1;
                    System.out.println("Added Pizza.\n");
                } else {
                    System.out.println("Menu is full. Cannot add more items.\n");
                } // end if capacity

            } // end if pizza
            else if (choice.equals("drink")) {

                String name = prompt(sc, "Drink name: ");
                double price = promptDouble(sc, "Price (e.g., 1.99): ");
                String size = prompt(sc, "Size (Small/Medium/Large): ");
                boolean carbonated = promptYesNo(sc, "Is it carbonated? (yes/no): ");
                boolean alcoholic = promptYesNo(sc, "Is it alcoholic? (yes/no): ");

                Drink d = new Drink(name, price, size, carbonated, alcoholic);

                if (count < MAX) {
                    items[count] = d;
                    count = count + 1;
                    System.out.println("Added Drink.\n");
                } else {
                    System.out.println("Menu is full. Cannot add more items.\n");
                } // end if capacity

            } //end else if drink


            else if (choice.equals("icecream")) {

                // --------------------------------------------------------
                // TODO: Prompt for ice cream details, then construct IceCream.
                //       Use your existing prompt helpers (prompt, promptDouble, promptInt) if available.
                //
                String name = prompt(sc, "Menu name for this ice cream: ");
                double price = promptDouble(sc, "Price (e.g., 3.49): ");
                String flavor = prompt(sc, "Flavor (e.g., Vanilla, Chocolate): ");
                int scoops = promptInt(sc, "Scoops (e.g., 1, 2, 3): ");
                String coneType = prompt(sc, "Cone type (Cup/Sugar/Waffle): ");

                IceCream ic = new IceCream(name, price, flavor, scoops, coneType);

                if (count < MAX) {
                    items[count] = ic;
                    count = count + 1;
                    System.out.println("Added IceCream.\n");
                } else {
                    System.out.println("Menu is full. Cannot add more items.\n");
                }//ends if capacity



            } // end else if ice cream








            else {
                System.out.println("Unrecognized option. Please type 'pizza', 'drink', or 'quit'.\n");
            } // end else invalid choice
        } // end while main loop

        // Display all items (polymorphic: Pizza/Drink versions run)
        System.out.println("\n=== Menu Summary (" + count + " items) ===");

        int i = 0;
        while (i < count) {
            items[i].displayItem();
            i = i + 1;
        } // end while display

        System.out.println("Done. Goodbye!");
        sc.close();
    } // end main

    // Prompt helpers
    private static String prompt(Scanner sc, String message) {
        System.out.print(message);
        String line = sc.nextLine();
        return line.trim();
    } // end prompt

    private static double promptDouble(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String line = sc.nextLine();
            String trimmed = line.trim();

            if (trimmed.isEmpty()) {
                return 0.0;
            } // end if empty

            try {
                double value = Double.parseDouble(trimmed);
                return value;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a valid number (e.g., 12.50).");
            } // end try/catch
        } // end while
    } // end promptDouble

    private static int promptInt(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String line = sc.nextLine();
            String trimmed = line.trim();

            try {
                int value = Integer.parseInt(trimmed);
                return value;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a valid integer (eg. 1, 2, 3)");
            }//end try/catch
        }//end while
    } //end promptInt

    private static boolean promptYesNo(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String line = sc.nextLine();
            String trimmed = line.trim().toLowerCase();

            if (trimmed.equals("yes")) {
                return true;
            } // end if yes
            if (trimmed.equals("no")) {
                return false;
            } // end if no

            System.out.println("Please type 'yes' or 'no'.");
        } // end while
    } // end promptYesNo
} // end class Main