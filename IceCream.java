// IceCream.java (SKELETON)
// ---------------------------------------------------------------------
// ROLE: Child/subclass of MenuItem representing an ice cream order.
// TASKS: Add fields, constructors, getters/setters, and override display.
// ---------------------------------------------------------------------

public class IceCream extends MenuItem {

    // ------------------------------------------------------------
    // TODO 1) Declare fields:
    //   private String flavor;
    //   private int scoops;
    //   private String coneType;
    // ------------------------------------------------------------

    private String flavor;
    private int scoops;
    private String coneType;



    // ------------------------------------------------------------
    // TODO 2) Full constructor:
    //   public IceCream(String name, double price, String flavor, int scoops, String coneType) {
    //       call super(name, price);
    //       set all fields
    //   }
    // Add end-of-block comments.
    // ------------------------------------------------------------

    public IceCream(String name, double price, String flavor, int scoops, String coneType) {
        super(name, price);
        this.flavor = flavor;
        this.scoops = scoops;
        this.coneType = coneType;

    }//Ends IceCream constructor


    // ------------------------------------------------------------
    // TODO 3) Overloaded constructor (fewer args):
    //   public IceCream(String name, double price, String flavor) {
    //       call super(name, price);
    //       set flavor;
    //       choose sensible defaults for scoops (e.g., 1) and coneType (e.g., "Cup");
    //   }
    // ------------------------------------------------------------



    // ---------------------------
    // TODO 4) Getters
    // ---------------------------



    // ---------------------------
    // TODO 5) Setters
    // (Optional: simple validation in setScoops to reject values < 1.)
    // ---------------------------



    // ------------------------------------------------------------
    // TODO 6) Override a display method:
    //   @Override
    //   public void displayItem() {
    //       Print "Type: IceCream"
    //       Print base info using getName() and getPrice()
    //       Print flavor, scoops, coneType
    //       Print a divider line
    //   }
    // ------------------------------------------------------------



} // end class IceCream