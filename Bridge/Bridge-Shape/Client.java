public class Client {
    public static void main(String[] args) {

        // Create a new instance of the Color class
        Color red = new RedColor();
        Color blue = new BlueColor();

        // Create a new instance of the Shape class
        Shape redRectangle = new Rectangle(red);
        Shape blueCircle = new Circle(blue);

        // Call the draw method of the Shape class
        redRectangle.draw();
        blueCircle.draw();

    }
}
