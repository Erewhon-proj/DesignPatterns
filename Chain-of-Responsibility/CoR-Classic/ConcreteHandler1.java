// ConcreteHandler1 class that implements Handler interface
public class ConcreteHandler1 implements Handler {
    // Reference to the next handler
    private Handler nextHandler;

    // Setter for the next handler
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Concrete implementation of the handleRequest method
    @Override
    public void handleRequest(String request) {
        if(request.equals("Request1")) {
            System.out.println("ConcreteHandler1 handles the request: " + request);
        }else if(nextHandler != null) {
            nextHandler.handleRequest(request);
        }else {
            System.out.println("No handler is available to handle the request: " + request);
        }
    }
}
