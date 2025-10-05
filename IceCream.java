// IceCream.java (SKELETON)
// ---------------------------------------------------------------------
// ROLE: Child/subclass of MenuItem representing an ice cream order.
// TASKS: Add fields, constructors, getters/setters, and override display.
// ---------------------------------------------------------------------

import java.sql.SQLOutput;

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

    public IceCream(String name, double price, String flavor) {
        super(name, price);
        this.flavor = flavor;
        this.scoops = 1;
        this.coneType = "Cup";
    } //ends constructor overloded

    // ---------------------------
    // TODO 4) Getters
    // ---------------------------

    public String getFlavor() {
        return flavor;
    }

    public int getScoops() {
        return scoops;
    }

    public String getConeType() {
        return coneType;
    }

    // ---------------------------
    // TODO 5) Setters
    // (Optional: simple validation in setScoops to reject values < 1.)
    // ---------------------------

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setScoops(int scoops) {
        if (scoops < 1) {
            this.scoops = 1;
        } else {
            this.scoops = scoops;
        }
    }

    public void setConeType(String coneType) {
        this.coneType = coneType;
    }

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

    @Override
    public void displayItem() {
        System.out.println("Type: IceCream");
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Flavor: " + flavor);
        System.out.println("Scoops: " + scoops);
        System.out.println("Come Type: " + coneType);
        System.out.println("-------------------------------");


    }//end displayItem


} // end class IceCream