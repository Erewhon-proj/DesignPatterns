public class Client {
    public static void main(String[] args) {

        // Create a book and an ebook
        Component book = new Book("Gamma Design Pattern", 38.5f, 650.3f);
        Component ebook = new Ebook("Fowler Refactoring", 40.0f);

        // Create a composite
        Component cart = new Composite();

        // Cast the composite to add the book and the ebook
        // the reason for this is that the add method is not part of the Component interface
        ((Composite) cart).add(book);
        ((Composite) cart).add(ebook);
        cart.print();

        ((Composite) cart).remove(book);
        cart.print();

        // Create a (leaf) book and print it directly
        System.out.println("--Leaf--");
        Component book2 = new Book("Clean Code", 50.0f, 700.0f);
        book2.print();
    }
}
