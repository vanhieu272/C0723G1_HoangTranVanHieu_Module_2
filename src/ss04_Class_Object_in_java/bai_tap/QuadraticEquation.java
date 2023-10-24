package ss04_Class_Object_in_java.bai_tap;


import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        return ((-b) - Math.sqrt(this.getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return ((-b) + Math.sqrt(this.getDiscriminant())) / (2 * a);
    }

    public void display(){
        if(this.getDiscriminant() < 0){
            System.out.println("The equation has no roots");
        } else if (this.getDiscriminant() == 0) {
            System.out.println("The equation has 1 root: " + this.getRoot1());
        }else{
            System.out.println("The equation has 2 roots: \nx1 = " + this.getRoot1() +"\nx2 = " + this.getRoot2());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Solve quadratic equation of the form ax^2 + bx + c = 0");

        do{
            System.out.println("Enter a: ");
            a = sc.nextDouble();
            if(a == 0){
                System.out.println("The quadratic equation has 'a' always different '0' ");
            }else{
                break;
            }
        }while (true);
        System.out.println("Enter b: ");
        b = sc.nextDouble();
        System.out.println("Enter c: ");
        c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        System.out.println("Your quadratic equation: ");
        System.out.println(quadraticEquation.getA() +"x^2" + "+" + quadraticEquation.getB() + "x" + "+" + quadraticEquation.getC() + "=" + "0");
        quadraticEquation.display();
        System.out.println(quadraticEquation.getRoot1());
    }
}
