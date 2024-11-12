public class Client {
    public static void main(String[] args) {

        // Create a sandwich
        Sandwich sandwich = new BaseSandwich();
        System.out.println("Base Sandwich: " + sandwich.price());

        // Add cheese to the sandwich
        Sandwich cheeseSandwich = new Cheese(sandwich);
        System.out.println("Cheese Sandwich: " + cheeseSandwich.price());

        // Full sandwich
        Sandwich completeSandwich = new Salad(new Cheese(sandwich));
        System.out.println("Complete Sandwich: " + completeSandwich.price());

    }
}
