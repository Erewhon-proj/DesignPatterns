public class Adapter implements Target{
    Adaptee adaptee;
    long a, b;

    // Constructor that takes an Adaptee object
    public Adapter (Adaptee adaptee, long a, long b) {
        this.adaptee = adaptee;
        this.a = a;
        this.b = b;
    }

    // Request method that calls the specificRequest method of the Adaptee object
    @Override
    public int request() {
        long multiply_result = adaptee.specificRequest(a,b);
        return (int) multiply_result;
    }
}