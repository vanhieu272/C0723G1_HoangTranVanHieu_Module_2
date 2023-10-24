package ss06_Inherit.bai_tap.Circle_Cylinder;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return (Math.PI * this.getRadius() * this.getRadius() * this.getHeight());
    }

    @Override
    public String toString() {
        return "{ A Cylinder with radius = " + this.getRadius() + ", height = " + this.getHeight() + ", color = " + this.getColor() + ", volume = " + this.getVolume() + " }";
    }

}

