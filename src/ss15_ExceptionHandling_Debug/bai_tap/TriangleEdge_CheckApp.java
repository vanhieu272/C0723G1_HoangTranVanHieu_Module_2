package ss15_ExceptionHandling_Debug.bai_tap;

import java.util.Scanner;


public class TriangleEdge_CheckApp {
    private static final Scanner scanner = new Scanner(System.in);
    public static double checkInputEdge(double edge) throws IllegalTriangleException {
        if (edge <= 0) {
            throw new IllegalTriangleException("Edge's length must be > 0");
        }
        return edge;
    }

    public static void checkTriangleEdge(double a, double b, double c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Not 3 edges of a triangle");
        } else {
            System.out.println("Is 3 edges of a triangle");
        }
    }

    public static double inputEdge(){
        double edge;
        do{
            try{
                 edge = Double.parseDouble(scanner.nextLine());
                 checkInputEdge(edge);
                 return edge;
            }catch (IllegalTriangleException ex){
                System.err.println(ex.getErrorMessage());
            }catch (NumberFormatException ex){
                System.err.println("Edge's length must be a number");
            }
        }while (true);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        do {
            System.out.println("Enter a: ");
            a = inputEdge();
            System.out.println("Enter b: ");
            b = inputEdge();
            System.out.println("Enter c: ");
            c =inputEdge();
            try {
                checkTriangleEdge(a, b, c);
                break;
            } catch (IllegalTriangleException ex) {
                System.err.println(ex.getErrorMessage());
            }
        } while (true);

        Triangle triangle = new Triangle(a, b, c);
        System.out.println(triangle);

    }
}
