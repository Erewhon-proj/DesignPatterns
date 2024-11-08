
// Decorator class
abstract class Dressing implements Sandwich {
    protected Sandwich sandwich;

    public Dressing(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public double price() {
        return sandwich.price();
    }

}
