package ss05_AccesModifier_StaticMethod_StaticProperty.bai_tap.AccesModifier1;

public class Circle {
    private double radius = 1.0d;
    private String color = "red";

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }


    public double getArea() {
        return radius * radius * Math.PI;
    }

}


