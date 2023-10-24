package ss07_Abstract_Interface.bai_tap.Resizeable_Colorable;

public class Square extends Shape implements IResizeable, IColorable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }


    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(this.getSide(), 2);
    }

    public double getPerimeter() {
        return this.getSide() * 4;
    }


    @Override
    public String toString() {
        return "A Square with side = "
                + getSide() + " Area = " + getArea()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.side += this.side * percent / 100;
    }

    @Override
    public void howToColor() {
        System.out.print(" - Color all four sides");
    }
}
