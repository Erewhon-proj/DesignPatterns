import java.util.ArrayList;
import java.util.List;

public class Order implements Prototype{
    private final String customer;
    private final List<String> products;
    private double total;

    // Constructor
    public Order(String customer, List<String> products, double total) {
        this.customer = customer;
        this.products = new ArrayList<>(products);
        this.total = total;
    }


    // Clone method to create a copy of the order
    @Override
    public Prototype clone() {
        System.out.println("Cloning order for customer: " + customer);
        return new Order(customer, new ArrayList<>(products), total);
    }


    // Adds a product to the new order, updating the total
    public void addProduct(String newProduct, double price) {
        System.out.println("Adding product " + newProduct + " to the order for customer " + customer);
        products.add(newProduct);
        total += price;
        System.out.println("Updated total: " + total);
    }


    // Prints the order details
    public void printOrder() {
        System.out.println("Order for: " + customer);
        System.out.println("Products: " + String.join(", ", products));
        System.out.println("Total: " + total + " USD\n");
    }

}
