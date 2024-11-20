//ConcretePrototype2 that implements Prototype interface
public class ConcretePrototype2 implements Prototype {

    private final int value;

    public ConcretePrototype2(int value) {
        this.value = value;
    }

    // Clone method that creates a new instance of ConcretePrototype2
    @Override
    public Prototype clone() {
        System.out.println("Cloning ConcretePrototype2 with value: " + value);
        return new ConcretePrototype2(value);
    }

    public void display (){
        System.out.println("ConcretePrototype2 with value: " + value);
    }
}
