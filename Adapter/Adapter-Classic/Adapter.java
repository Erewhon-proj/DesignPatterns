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

/* Alternatively I could have done it like this too

    public class Adapter extends Adaptee implements Target {
        private long a, b;

        public Adapter(long a, long b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int request() {
            long multiply_result = specificRequest(a, b);
            return (int) multiply_result;
        }
    }

*/