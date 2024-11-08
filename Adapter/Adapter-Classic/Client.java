public class Client {

    public static void main (String[] args) {
       Adaptee adaptee = new Adaptee();
       Target target = new Adapter(adaptee, 5, 10);

       int result = target.request();
       System.out.println("Result: " + result);
    }

}