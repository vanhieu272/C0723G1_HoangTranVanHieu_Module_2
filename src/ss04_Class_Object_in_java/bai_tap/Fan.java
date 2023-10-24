package ss04_Class_Object_in_java.bai_tap;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0d;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(isOn()) {
            this.speed = speed;
        }else {
            this.speed = 0;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (isOn()) {
            return "Status: Fan is on" + ", speed: " + getSpeed() + ", color: " + getColor() + ", Radius: " + getRadius();
        } else {
            return "Status: Fan is off" + ", color: " + getColor() + ", Radius: " + getRadius();
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(FAST);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setSpeed(MEDIUM);
        fan2.setColor("blue");
        fan2.setRadius(5);
        System.out.println(fan2);
    }
}
