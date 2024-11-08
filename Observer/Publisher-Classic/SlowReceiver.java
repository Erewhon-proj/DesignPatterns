import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

/** SlowReceiver plays the role Subscriber and ConcreteObserver */
public class SlowReceiver implements Subscriber<String> {
    private Subscription subscr;

    @Override
    public void onSubscribe(Subscription subscription) {
        System.out.println("Slow: subscribed ");
        subscr = subscription;
        subscription.request(1);
    }

    /** onNext will be invoked each time the Publisher has a new content */
    @Override
    public void onNext(String item) {
        System.out.println("Slow: received " + item);
        subscr.request(1);
        slowingDown();
    }

    private void slowingDown() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onError(Throwable throwable) {
    }

    @Override
    public void onComplete() {
        System.out.println("Slow: complete");
    }
}