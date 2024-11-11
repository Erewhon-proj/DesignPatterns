public class Client {
    public static void main(String[] args) {

        // Create the handlers
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        // Set the chain of responsibility
        ((ConcreteHandler1) handler1).setNextHandler(handler2);

        // Send the requests to the chain of responsibility
        System.out.println("Client sends Request1:");
        handler1.handleRequest("Request1");

        System.out.println("\nClient sends Request2:");
        handler1.handleRequest("Request2");

        System.out.println("\nClient sends UnknownRequest:");
        handler1.handleRequest("UnknownRequest");
    }
}
