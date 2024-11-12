
// Decorator class
abstract class Dressing implements Sandwich {
    protected Sandwich sandwich;

    public Dressing(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    // Delegate to the wrapped component
    // Call the operation() method of the ConcreteComponent class (BaseSandwich)
    @Override
    public double price() {
        return sandwich.price();
    }

}
