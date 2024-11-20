/*
 * This is a very simplified application to help you understand how this DP works, but in practice, it does nothing useful.
 * See the 'Prototype-Document' example to understand it more deeply.
 */

public class Client {
    public static void main(String[] args) {

        // Create instances of ConcretePrototype1 and ConcretePrototype2
        Prototype prototype1 = new ConcretePrototype1("I");
        Prototype prototype2 = new ConcretePrototype2(2);

        // Clone the instances
        Prototype clone1 = prototype1.clone();
        Prototype clone2 = prototype2.clone();

        // Show the attributes of the instances
        ((ConcretePrototype1) clone1).show();
        ((ConcretePrototype2) clone2).display();
    }

}
