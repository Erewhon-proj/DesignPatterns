// Client class to test the Facade pattern
public class Client {
    public static void main(String[] args) {

        Facade facade = new Facade();

        // Call the facade methods
        facade.operation1();
        facade.operation2();
    }
}
