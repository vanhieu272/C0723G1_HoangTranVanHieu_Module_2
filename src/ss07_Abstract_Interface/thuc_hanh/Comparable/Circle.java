package ss07_Abstract_Interface.thuc_hanh.Comparable;

import ss06_Inherit.thuc_hanh.Shape;

public class Circle extends Shape {
    private double radius = 1.0;

    Circle(){
    }

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled ){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public double getArea(){
        return radius * radius *3.14;
    }

    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString(){
        return "A circle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }
}

