import java.util.ArrayList;
import java.util.List;

public class ProductPool {

    // The pool of products
    private final List<Product> pool = new ArrayList<>();

    public Product getProduct(String type) {
        // If there is a product available in the pool, return it
        if (!pool.isEmpty()) {
            System.out.println("Reusing a product from the pool");
            return pool.removeFirst();
        }

        // If there is no product available in the pool, create a new one
        System.out.println("Creating a new product of type: " + type);
        if (type.equals("A")) {
            return new ConcreteProductA();
        } else if (type.equals("B")) {
            return new ConcreteProductB();
        }
        return null;
    }

    // When the client is done with the product, it releases it back to the pool
    public void releaseProduct(Product product) {
        System.out.println("Releasing product back to the pool");
        pool.add(product);
    }
}
