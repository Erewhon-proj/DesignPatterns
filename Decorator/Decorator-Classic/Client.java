// Client class that uses the Decorator pattern
public class Client {
    public static void main(String[] args) {

        // Create a base text component
        Component baseText = new ConcreteComponent();
        System.out.println("Text: " + baseText.operation());

        // Decorate the base text component with quotes
        Component quotedText = new ConcreteDecoratorA(baseText);
        System.out.println("Text with quotes: " + quotedText.operation());

        // Decorate the base text component with asterisks
        Component emphasizedText = new ConcreteDecoratorB(baseText);
        System.out.println("Text with asterisks: " + emphasizedText.operation());

        // Decorate the base text component with quotes and asterisks
        Component fullyDecoratedText = new ConcreteDecoratorB(new ConcreteDecoratorA(baseText));
        System.out.println("Text with quotes and asterisks: " + fullyDecoratedText.operation());
    }
}
