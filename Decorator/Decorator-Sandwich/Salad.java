
//Concrete Decorator class
class Salad extends Dressing {

    // Super keyword is used to call the constructor of the parent class
    public Salad(Sandwich sandwich) {
        super(sandwich);
    }

    // Delegate to the wrapped component
    @Override
    public double price() {
        return super.price() + 1.0;
    }
}
