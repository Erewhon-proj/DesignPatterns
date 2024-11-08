public class Adapter implements Target{
    Adaptee adaptee;
    long a, b;

    public Adapter (Adaptee adaptee, long a, long b) {
        this.adaptee = adaptee;
        this.a = a;
        this.b = b;
    }

    @Override
    public int request() {
        long multiply_result = adaptee.specificRequest(a,b);
        return (int) multiply_result;
    }
}