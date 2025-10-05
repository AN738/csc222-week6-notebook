import java.util.ArrayList;


public class ArrayPractice {
    public static void main(String[] args) {

        int[] ages = new int[5];

        //set array position of 0 to 18
        ages[0] = 18;
        ages[1] = 33;

        // Declare and initialize
        int[] scores = new int[5];                 // space for 5 integers
        String[] names = {"Alice", "Bob", "Carla"}; // literal initialization

        // Access and update
        scores[0] = 90;
        System.out.println("First score: " + scores[0]);

        // Loop through with a descriptive index variable
        for (int index = 0; index < names.length; index++) {
            System.out.println("Name " + index + ": " + names[index]);
        }



// Array: Fixed dorm rooms
        String[] dormRooms = {"Room 101", "Room 102", "Room 103", "Room 104"};
        for (int roomIndex = 0; roomIndex < dormRooms.length; roomIndex++) {
            System.out.println("Dorm Room: " + dormRooms[roomIndex]);
        }

// ArrayList: Students in dorms (change each term)


        ArrayList<String> dormStudents = new ArrayList<>();
        dormStudents.add("Alice");
        dormStudents.add("Bob");
        dormStudents.add("Carla");
        dormStudents.remove("Alice"); // moved out

        System.out.println("Current Dorm Students: " + dormStudents);



        //space for 5 integers

    }//ends our main method/driver



}//ends our Array Practice class
