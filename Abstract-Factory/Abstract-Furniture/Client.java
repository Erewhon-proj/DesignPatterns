// Purpose: This is the client class that will be used to test the program.
public class Client {

    // Splitting up creation and usage of the furniture
    private final Chair chair;
    private final Table table;

    // This is the constructor for the Client class.
    public Client(FurnitureFactory factory) {
        chair = factory.createChair();
        table = factory.createTable();
    }

    // This method will describe the furniture.
    public void describeFurniture() {
        chair.describe();
        table.describe();
    }

    public static void main(String[] args) {

        // Creating modern furniture
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Client modernClient = new Client(modernFactory);
        System.out.println("Modern Furniture:");
        modernClient.describeFurniture();

        // Creating baroque furniture
        FurnitureFactory baroqueFactory = new BaroqueFurnitureFactory();
        Client baroqueClient = new Client(baroqueFactory);
        System.out.println("Baroque Furniture:");
        baroqueClient.describeFurniture();

    }
}
