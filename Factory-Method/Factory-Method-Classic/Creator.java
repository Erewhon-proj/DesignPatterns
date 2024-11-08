public abstract class Creator {
    public abstract Product factoryMethod(String type);

    public void useProduct(String type) {
        Product product = factoryMethod(type);
        product.use();
    }

}