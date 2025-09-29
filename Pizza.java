// Pizza.java
// ---------------------------------------------------------------------
// ROLE: Child/subclass of MenuItem representing a pizza.
// TOPICS: Inheritance with "extends", calling parent constructor with
//         "super(...)", and overriding displayItem() to show details.
// ---------------------------------------------------------------------

public class Pizza extends MenuItem {

    // Extra fields unique to Pizza
    private String size;        // e.g., "Small", "Medium", "Large"
    private String crustType;   // e.g., "Thin", "Hand-Tossed", "Deep Dish"
    private String toppings;    // comma-separated string (simple for Week 5)

    // -----------------------------------------------------------------
    // Full constructor: includes MenuItem fields + Pizza fields.
    // -----------------------------------------------------------------
    public Pizza(String name, double price, String size, String crustType, String toppings) {
        super(name, price);      // initialize parent state
        this.size = size;
        this.crustType = crustType;
        this.toppings = toppings;
    } // end constructor Pizza(name, price, size, crustType, toppings)

    // -----------------------------------------------------------------
    // Overloaded constructor (fewer args): defaults for crust and toppings.
    // -----------------------------------------------------------------
    public Pizza(String name, double price, String size) {
        super(name, price);
        this.size = size;
        this.crustType = "Regular";
        this.toppings = "Cheese";
    } // end constructor Pizza(name, price, size)

    // ---------------------------
    // Getters
    // ---------------------------
    public String getSize() {
        return size;
    } // end getSize

    public String getCrustType() {
        return crustType;
    } // end getCrustType

    public String getToppings() {
        return toppings;
    } // end getToppings

    // ---------------------------
    // Setters
    // ---------------------------
    public void setSize(String size) {
        this.size = size;
    } // end setSize

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    } // end setCrustType

    public void setToppings(String toppings) {
        this.toppings = toppings;
    } // end setToppings

    // -----------------------------------------------------------------
    // OVERRIDE: displayItem() to include pizza details.
    // -----------------------------------------------------------------
    @Override
    public void displayItem() {
        System.out.println("Type: Pizza");
        // Show base info from parent by using getters
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        // Show pizza-specific fields
        System.out.println("Size: " + size);
        System.out.println("Crust: " + crustType);
        System.out.println("Toppings: " + toppings);
        System.out.println("----------------------");
    } // end displayItem (override)
} // end class Pizza