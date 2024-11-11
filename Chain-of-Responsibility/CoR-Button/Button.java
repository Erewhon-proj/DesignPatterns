//ConcreteHandler
public class Button implements HelpHandler{
    private HelpHandler next;

    @Override
    public void handleRequest() {
        if (next != null) {
            System.out.println("Button: Cannot handle, passing to next handler.");
            next.handleRequest();
        }else {
            System.out.println("Button: This is the last handler.");
        }
    }

    @Override
    public void activate() {
        System.out.println("Button: Activated, performing main action.");
    }

    // Set the next handler in the chain
    @Override
    public void setNext(HelpHandler nextHandler) {
        this.next = nextHandler;
    }
}
