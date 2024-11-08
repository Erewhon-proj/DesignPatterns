
// Leaf class that implements the Component interface
public class Book implements Component {
    private final String title;
    private final float price;
    private final float weight;

    public Book(String title, float price, float weight) {
        this.title = title;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public void print() {
        System.out.println("Title: " + title + " Price: " + price + " Weight: " + weight);
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
