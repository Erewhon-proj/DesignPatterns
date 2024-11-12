// ConcreteDecoratorA class
public class ConcreteDecoratorA extends Decorator {

    // Constructor that takes a Component object
    // super keyword is used to call the constructor of the parent class
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public String operation() {
        return "\"" + super.operation() + "\"";
    }
}
