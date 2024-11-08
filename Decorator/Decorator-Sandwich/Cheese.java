
// Concrete decorator class
class Cheese extends Dressing {

    public Cheese(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double price() {
        return super.price() + 1.5;
    }
}
