import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

/** Display plays the role Subscriber and ConcreteObserver */
public class Display implements Subscriber<String> {
    private Subscription subscr;

    @Override
    public void onSubscribe(Subscription subscription) {
        System.out.println("Display: subscribed");
        subscr = subscription;
        subscription.request(1);
    }

    /** onNext will be invoked each time the Publisher has a new content */
    @Override
    public void onNext(String item) {
        System.out.println("Display: received " + item);
        subscr.request(1);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {
        System.out.println("Display: complete");
    }
}