// Decorator class that implements the Component interface
public class Decorator implements Component {

    // The component that this decorator wraps
    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        return component.operation();
    }

}
