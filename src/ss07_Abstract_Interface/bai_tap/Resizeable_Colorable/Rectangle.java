package ss07_Abstract_Interface.bai_tap.Resizeable_Colorable;

public class Rectangle extends Shape implements IResizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "
                + getWidth()
                + " and length = "
                + getLength()
                + " Area = " + getArea() + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.length += this.length * percent / 100;
        this.width += this.width * percent / 100;
    }

}
