//ConcreteDecoratorB class
public class ConcreteDecoratorB     extends Decorator {

    // Constructor that takes a Component object
    // super keyword is used to call the constructor of the parent class
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public String operation() {
        return "*" + super.operation() + "*";
    }
}
