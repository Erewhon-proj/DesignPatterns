public class ConcreteDecoratorB     extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public String operation() {
        return "*" + super.operation() + "*";
    }
}
