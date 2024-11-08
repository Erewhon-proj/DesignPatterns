import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    // Composite class has a list of children
    private final List<Component> children = new ArrayList<>();

    // Print the composite and its children
    @Override
    public void print() {
        System.out.println("--Composite--");
        for (Component child : children) {
            child.print();
        }
        System.out.println("--End Composite--");
        System.out.println("Total price: " + getPrice());
    }

    @Override
    public float getPrice() {
        // Calculate the total price of the composite
        return children.stream().map(Component::getPrice).reduce(0.0f, Float::sum);
    }

    @Override
    public float getWeight() {
        // Calculate the total weight of the composite
        return children.stream().map(Component::getWeight).reduce(0.0f, Float::sum);
    }

    public void add(Component component) {
        // Add a component to the composite
        System.out.println("Adding component to composite");
        children.add(component);
    }

    public void remove(Component component) {
        // Remove a component from the composite
        System.out.println("Removing component from composite");
        children.remove(component);
    }

}
