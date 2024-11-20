//ConcretePrototype1 that implements Prototype interface
public class ConcretePrototype1 implements Prototype {

    private final String attribute;

    public ConcretePrototype1(String attribute) {
        this.attribute = attribute;
    }

    // Clone method that creates a new instance of ConcretePrototype1
    @Override
    public Prototype clone() {
        System.out.println("Cloning ConcretePrototype1 with attribute: " + attribute);
        return new ConcretePrototype1(attribute);
    }

    public void show (){
        System.out.println("ConcretePrototype1 with attribute: " + attribute);
        }
    }
