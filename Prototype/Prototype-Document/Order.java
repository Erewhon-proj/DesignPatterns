public class Order implements Prototype{
    private final String customer;
    private final String products;
    private double total;

    // Constructor
    public Order(String customer, String products, double total) {
        this.customer = customer;
        this.products = products;
        this.total = total;
    }

    // Clone method to create a copy of the order
    @Override
    public Prototype clone() {
        System.out.println("Cloning order for customer: " + customer);
        return new Order(customer, products, total);
    }

    // Adds a product to the new order, updating the total
    public void addProduct(String newProduct, double price) {
        System.out.println("Adding product " + newProduct + " to the order for customer " + customer);
        total += price;
        System.out.println("Updated total: " + total);
    }

    // Prints the order details
    public void printOrder() {
        System.out.println("Order for: " + customer);
        System.out.println("Products: " + products);
        System.out.println("Total: " + total + " USD\n");
    }
}
