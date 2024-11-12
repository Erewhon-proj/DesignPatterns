
// Concrete decorator class
class Cheese extends Dressing {

    // Super keyword is used to call the constructor of the parent class
    public Cheese(Sandwich sandwich) {
        super(sandwich);
    }

    // Delegate to the wrapped component
    @Override
    public double price() {
        return super.price() + 1.5;
    }
}
