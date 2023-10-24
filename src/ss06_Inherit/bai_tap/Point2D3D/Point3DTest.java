package ss06_Inherit.bai_tap.Point2D3D;

public class Point3DTest {
    public static void main(String[] args) {
        //Khoi tao co tham so
        System.out.println("Point 3D_1: ");
        Point3D point3D = new Point3D(5.0f, 5.0f, 5.0f);
        System.out.println(point3D);

        //Khoi tao khong tham so
        System.out.println("Point 3D_2: ");
        Point3D point3D_1 = new Point3D();
        point3D_1.setX(1.0f);
        point3D_1.setY(2.0f);
        point3D_1.setZ(3.0f);
        System.out.println(point3D_1);

        //set gia tri moi
        System.out.println("Point 3D_2 after change value of properties: ");
        point3D_1.setXYZ(10.f, 10.0f, 10.f);
        System.out.println(point3D_1);
    }
}
