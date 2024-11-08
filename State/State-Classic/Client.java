public class Client {

    public static void main(String[] args) {

        // Create a new context
        Context context = new Context();


        context.show();
        context.forward();
        context.show();
        context.backwards();
        context.show();
        context.backwards();
    }
}