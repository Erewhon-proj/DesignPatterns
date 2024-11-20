// Client class to demonstrate the usage of Singleton
public class Client {

    public static void main(String[] args) {

        // Access the Singleton instance
        Singleton singletonInstance = Singleton.getInstance();

        // Use methods from the Singleton instance
        singletonInstance.readFile("./", "amounts.csv");
        singletonInstance.calculateSum();
        System.out.println("Total: " + singletonInstance.getSum());

        // Access the Singleton instance again
        Singleton anotherInstance = Singleton.getInstance();

    }
}
