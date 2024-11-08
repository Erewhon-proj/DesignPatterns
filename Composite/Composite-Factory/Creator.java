
// "Factory Method" Pattern
// Creator (Factory)
class Creator {

    public static Component getBook(String title, float price, float weight) {
        System.out.println("Creator: Creating a Book");
        return new Book(title, price, weight);
    }

    public static Component getEbook(String title, float price) {
        System.out.println("Creator: Creating an Ebook");
        return new Ebook(title, price);
    }

    public static Composite getComposite() {
        System.out.println("Creator: Creating a Composite");
        return new Composite();
    }
}
