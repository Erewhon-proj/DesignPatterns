// Handler Interface
public interface HelpHandler {
    void handleRequest();
    void activate();
    void setNext(HelpHandler nextHandler);
}
