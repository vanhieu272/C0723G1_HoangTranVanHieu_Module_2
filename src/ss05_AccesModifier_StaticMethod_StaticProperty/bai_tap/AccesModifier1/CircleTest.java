package ss05_AccesModifier_StaticMethod_StaticProperty.bai_tap.AccesModifier1;

public class CircleTest {
    public static void main(String[] args) {
        System.out.println("Circle 1: ");
        Circle circle1 = new Circle();
        System.out.println("Radius = " + circle1.getRadius());
        System.out.println("Color = " + circle1.getColor());
        System.out.println("Area = " + circle1.getArea());

        System.out.println("\nCircle 2: ");
        Circle circle2 = new Circle(2.0d);
        System.out.println("Radius = " + circle2.getRadius());
        System.out.println("Color = " + circle2.getColor());
        System.out.println("Area = " + circle2.getArea());
    }
}

//Kết quả kiểm thử:
/* Đổi access modifier của các phương thức set/get thành private thì lớp TestCircle không thể
truy cập đến phương thức đó.
*/

 /* Đổi access modifier thành protected thì vẫn có thể truy cập nếu trong cùng package,
 nếu khác package (mà không kế thừa) thì không.
 */

/* Đổi access modifier thành default thì vẫn có thể truy cập,
nếu đưa lớp CircleTest ra khỏi package thì không thể.
*/
