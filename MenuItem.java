// MenuItem.java
// ------------------------------------------------------------
// ROLE: Base (parent/superclass) for all menu items.
// FOCUS: Encapsulation, overloaded constructors, display method.
// ------------------------------------------------------------

public class MenuItem {

    // --------------------------------------------------------
    // Instance variables (fields) - private for encapsulation.
    // --------------------------------------------------------
    private String name;
    private double price;

    // --------------------------------------------------------
    // Full constructor (2-arg): most complete version.
    // Other constructors will delegate to this one.
    // --------------------------------------------------------
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    } // end constructor MenuItem(name, price)

    // --------------------------------------------------------
    // Overloaded constructor (1-arg): name only, default price.
    // --------------------------------------------------------
    public MenuItem(String name) {
        this(name, 0.0);
    } // end constructor MenuItem(name)

    // --------------------------------------------------------
    // Overloaded constructor (0-arg): defaults for both.
    // --------------------------------------------------------
    public MenuItem() {
        this("Unknown Item", 0.0);
    } // end constructor MenuItem()

    // ---------------------------
    // Getters (accessors)
    // ---------------------------
    public String getName() {
        return name;
    } // end getName

    public double getPrice() {
        return price;
    } // end getPrice

    // ---------------------------
    // Setters (mutators)
    // ---------------------------
    public void setName(String name) {
        this.name = name;
    } // end setName

    public void setPrice(double price) {
        this.price = price;
    } // end setPrice

    // --------------------------------------------------------
    // Display method.
    // Subclasses may OVERRIDE this to add their own fields.
    // --------------------------------------------------------
    public void displayItem() {
        System.out.println("Type: MenuItem");
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("----------------------");
    } // end displayItem
} // end class MenuItem