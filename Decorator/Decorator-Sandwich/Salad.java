
//Concrete Decorator class
class Salad extends Dressing {

    public Salad(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double price() {
        return super.price() + 1.0;
    }
}
