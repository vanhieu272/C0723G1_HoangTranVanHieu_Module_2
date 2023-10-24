package ss06_Inherit.bai_tap.Point_MoveablePoint;

public class PointTest {
    public static void main(String[] args) {
        //Khoi tao khong tham so
        Point point1 = new Point();
        point1.setX(10);
        point1.setY(10);
        System.out.println("Point 1: " + point1);

        //Khoi tao co tham so
        Point point2 = new Point(20.0f, 30.0f);
        System.out.println("Point 2: " + point2);

        //Thay doi gia tri thuoc tinh
        point2.setXY(50.0f, 50.0f);
        System.out.println("Point 2 after change value of properties: " + point2);

    }


}
