public class Client {
    public static void main(String[] args) {
        
        // Creo il ConcreteComponent di base
        Component baseText = new ConcreteComponent();
        System.out.println("Testo di base: " + baseText.operation());

        // Aggiungo le virgolette con ConcreteDecoratorA
        Component quotedText = new ConcreteDecoratorA(baseText);
        System.out.println("Testo con virgolette: " + quotedText.operation());

        // Aggiungo asterischi attorno al testo con ConcreteDecoratorB
        Component emphasizedText = new ConcreteDecoratorB(baseText);
        System.out.println("Testo con asterischi: " + emphasizedText.operation());

        // Combinazione di entrambi i decoratori: virgolette e asterischi
        Component fullyDecoratedText = new ConcreteDecoratorB(new ConcreteDecoratorA(baseText));
        System.out.println("Testo con virgolette e asterischi: " + fullyDecoratedText.operation());
    }
}
