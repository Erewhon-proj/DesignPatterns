// Class Facade - simple interface to the complex subsystem
public class Facade {

    // Reference to the subsystems
    private final ClassA classA;
    private final ClassB classB;
    private final ClassC classC;

    // Constructor
    public Facade() {
        this.classA = new ClassA();
        this.classB = new ClassB();
        this.classC = new ClassC();
    }

    // Method to perform the complex operation
    public void operation1() {
        System.out.println("Facade operation1 - calling subsystem A and B");
        classA.operationA();
        classB.operationB();

    }

    // Method to perform the complex operation
    public void operation2() {
        System.out.println("Facade operation2 - calling subsystem B and C");
        classB.operationB();
        classC.operationC();
    }
}
