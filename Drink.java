// Drink.java
// ---------------------------------------------------------------------
// ROLE: Child/subclass of MenuItem representing a drink.
// TOPICS: Inheritance with "extends", "super(...)", override displayItem().
// ---------------------------------------------------------------------

public class Drink extends MenuItem {

    // Extra fields unique to Drink
    private String size;          // e.g., "Small", "Medium", "Large"
    private boolean isCarbonated; // true if soda/sparkling
    private boolean isAlcoholic;  // true if alcoholic beverage

    // -----------------------------------------------------------------
    // Full constructor: includes MenuItem fields + Drink fields.
    // -----------------------------------------------------------------
    public Drink(String name, double price, String size, boolean isCarbonated, boolean isAlcoholic) {
        super(name, price);
        this.size = size;
        this.isCarbonated = isCarbonated;
        this.isAlcoholic = isAlcoholic;
    } // end constructor Drink(name, price, size, isCarbonated, isAlcoholic)

    // ---------------------------
    // Getters
    // ---------------------------
    public String getSize() {
        return size;
    } // end getSize

    public boolean getIsCarbonated() {
        return isCarbonated;
    } // end getIsCarbonated

    public boolean getIsAlcoholic() {
        return isAlcoholic;
    } // end getIsAlcoholic

    // ---------------------------
    // Setters
    // ---------------------------
    public void setSize(String size) {
        this.size = size;
    } // end setSize

    public void setIsCarbonated(boolean value) {
        this.isCarbonated = value;
    } // end setIsCarbonated

    public void setIsAlcoholic(boolean value) {
        this.isAlcoholic = value;
    } // end setIsAlcoholic

    // -----------------------------------------------------------------
    // OVERRIDE: displayItem() to include drink details.
    // -----------------------------------------------------------------
    @Override
    public void displayItem() {
        System.out.println("Type: Drink");
        // Show base info from parent by using getters
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        // Show drink-specific fields
        System.out.println("Size: " + size);
        System.out.println("Carbonated: " + (isCarbonated ? "Yes" : "No"));
        System.out.println("Alcoholic: " + (isAlcoholic ? "Yes" : "No"));
        System.out.println("----------------------");
    } // end displayItem (override)
} // end class Drink