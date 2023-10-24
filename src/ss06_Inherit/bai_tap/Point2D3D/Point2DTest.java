package ss06_Inherit.bai_tap.Point2D3D;

import ss06_Inherit.bai_tap.Point_MoveablePoint.Point;

public class Point2DTest {
    public static void main(String[] args) {
        //Khoi tao co tham so
        System.out.println("Point 2D_1: ");
        Point2D point2D_1 = new Point2D(5.0f, 5.0f);
        System.out.println(point2D_1);

        //Khoi tao khong tham so
        System.out.println("Point 2D_2: ");
        Point2D point2D_2 = new Point2D();
        point2D_2.setX(10.0f);
        point2D_2.setY(10.0f);
        System.out.println(point2D_2);

        //Thay doi gia tri thuoc tinh
        System.out.println("Point2d_2 after change value of properties: ");
        point2D_2.setXY(20.0f, 20.0f);
        System.out.println(point2D_2);
    }
}
