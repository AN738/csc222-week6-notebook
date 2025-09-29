import javax.xml.namespace.QName;

public class PizzaTester {

    public static void main(String[] args) {
        System.out.println("Used to test our Pizza overloaded Constructors");
        //Create a pizza object

        System.out.println("Example using one of the Pizza constructor");
        System.out.println("Only specify name, price and size:");

        Pizza pizzal = new Pizza(name: "Best Pizza", price: "20.99", size: "Large");
        //output pizzal
        pizzal.displayItem();

        pizza pizza2 = new Pizza("2nd Best Pizza", price: 16.99, size:"Large", crustType:"Thin", toppings:"Jaibas");


    }//ends our main Method
}//ends our main Class

