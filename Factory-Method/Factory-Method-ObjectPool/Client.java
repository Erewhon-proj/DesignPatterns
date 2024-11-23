// Client class to demonstrate the Object Pool pattern,
// combined with the Factory Method pattern for creating objects when needed.

public class Client {

    public static void main(String[] args) {
        ProductPool pool = new ProductPool();

        // Get a product from the pool
        Product productA = pool.getProduct("A");
        productA.use();

        // Release the product back to the pool
        pool.releaseProduct(productA);

        // Get the product from the pool again
        Product reusedProductA = pool.getProduct("A");
        reusedProductA.use();

        // Get a new product from the pool
        Product productB = pool.getProduct("B");
        productB.use();
    }
}
