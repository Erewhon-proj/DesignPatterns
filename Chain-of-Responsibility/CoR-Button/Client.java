public class Client {
    public static void main(String[] args) {

        // Create the chain of responsibility
        HelpHandler tooltip = new Tooltip();
        HelpHandler button = new Button();

        // Set the chain of responsibility
        button.setNext(tooltip);


        tooltip.activate();
        button.activate();

        // Send support request to the chain
        System.out.println("\nClient: Sending support request to Button");
        button.handleRequest();

        System.out.println("\nClient: Sending support request directly to Tooltip");
        tooltip.handleRequest();

    }
}
