package ss07_Abstract_Interface.thuc_hanh.Comparable;

public class Shape {
    public String color = "green";
    public boolean filled = true;

    public Shape(){
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        if(isFilled()) {
            return "A Shape with color " + getColor() + " and " + "filled";
        }else {
            return "A Shape with color " + getColor() + " and " + " not filled";
        }
    }
}
