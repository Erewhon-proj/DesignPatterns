import java.util.List;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.Flow.Subscriber;

/** NoteProducer plays the role Publisher and ConcreteSubject */
public class NoteProducer {
    private List<String> l = List.of("my", "favourite", "song", "is");
    private final SubmissionPublisher<String> publ = new SubmissionPublisher<>();

    public void generate() {
        System.out.println("NoteProducer: number of subscribers " + publ.getNumberOfSubscribers());
        for (String elem : l)
            publ.submit(elem);
        System.out.println("NoteProducer: all content has been sent");
        publ.close();
        System.out.println("NoteProducer: afer invoking close");
    }

    public void attach(Subscriber<String> sub) {
        publ.subscribe(sub);
        System.out.println("NoteProducer: a subscriber was attached");
    }
}