public class Ebook implements Component {
    private final String title;
    private final float price;

    public Ebook(String title, float price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Title: " + title + " Price: " + price);
    }

    @Override
    public float getPrice() {
        return ebookDiscount();
    }

    @Override
    public float getWeight() {
        return 0;
    }

    // Calculate the price of the ebook with a 20% discount
    private float ebookDiscount(){
        return price * 0.8f;
    }

}
