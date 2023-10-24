package ss07_Abstract_Interface.bai_tap.Resizeable_Colorable;

public class MainApp {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(3.0f);
        shape[1] = new Rectangle(5.0f, 10.0f);
        shape[2] = new Square(5.0f);

        System.out.println("Before resize: ");
        System.out.print("\nCircle area = " + (shape[0]).getArea());
        System.out.print("\nRectangle area = " + (shape[1]).getArea());
        System.out.print("\nSquare area = " + (shape[2]).getArea());
        System.out.print("\n======================================");

        System.out.println("\nAfter resize: ");
        for (Shape value : shape) {
            //Resizable
            double percent = Math.random() * 100;
            ((IResizeable) value).resize(percent);
            System.out.print("\nNew area = " + value.getArea());
            //Colorable
            if (value instanceof IColorable) {
                ((IColorable) value).howToColor();
            }
        }
    }
}
