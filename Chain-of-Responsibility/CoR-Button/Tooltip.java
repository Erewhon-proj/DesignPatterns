// ConcreteHandler for HelpHandler
public class Tooltip implements HelpHandler{

    private HelpHandler next;

    @Override
    public void handleRequest() {
        if (next != null) {
            System.out.println("Tooltip: Cannot handle, passing to next handler.");
            next.handleRequest();
        }else {
            System.out.println("Tooltip: This is the last handler.");
        }
    }

    @Override
    public void activate() {
        System.out.println("Tooltip: Activated, showing additional info.");
    }

    // Set the next handler in the chain
    @Override
    public void setNext(HelpHandler nextHandler) {
        this.next = nextHandler;
    }
}
