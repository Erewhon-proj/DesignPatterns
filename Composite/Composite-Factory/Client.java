public class Client {
    public static void main(String[] args) {

        // Create a book and an ebook using Creator
        Component book = Creator.getBook("Gamma Design Pattern", 38.5f, 650.3f);
        Component ebook = Creator.getEbook("Fowler Refactoring", 40.0f);

        // Create a composite using Creator
        Composite cart = Creator.getComposite();

        // Add items to the composite (no cast needed because cart is of type Composite)
        cart.add(book);
        cart.add(ebook);

        // Print the contents of the cart
        cart.print();

    }
}
