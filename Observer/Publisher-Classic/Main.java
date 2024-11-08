import java.util.List;

public class Main {

    public static void main(String[] args) {
        NoteProducer prod = new NoteProducer();

        prod.attach(new Display());
        prod.attach(new SlowReceiver());

        prod.generate();
        System.out.println("Main: all messages were sent");
        slowingDown();
    }

    private static void slowingDown() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}