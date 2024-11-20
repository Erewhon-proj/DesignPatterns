import java.util.List;

public class Client {
    public static void main(String[] args) {
        // Create an original order
        Order baseOrder = new Order("Bryan", List.of("Computer", "Keyboard"), 1500.00);

        System.out.println("Original Order:");
        baseOrder.printOrder();

        // Create a new order based on the original template
        Order modifiedOrder = (Order) baseOrder.clone();
        modifiedOrder.addProduct("Mouse", 25.00); // Add a new product

        System.out.println("Modified Order (Clone of the original):");
        modifiedOrder.printOrder();
    }
}
