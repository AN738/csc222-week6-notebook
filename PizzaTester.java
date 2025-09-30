public class PizzaTester {

    public static void main(String[] args) {
        System.out.println("Used to test our Pizza overloaded Constructors");
        //Create a pizza1 object

        System.out.println("Example using one of the Pizza constructor");
        System.out.println("Only specify name, price and size:");

        Pizza pizza1 = new Pizza("Best Pizza",20.99, "Large");
        //output pizza1
        pizza1.displayItem();

        System.out.println("Example using a different Pizza constructor");
        System.out.println("Specify all of the Pizza attributes:");

        Pizza pizza2 = new Pizza("2nd Best Pizza", 16.99, "Large", "Thin", "Mystery Meat");
        //output pizza2
        pizza2.displayItem();
        

    }//ends our main Method
}//ends our main Class