package ss06_Inherit.bai_tap.Circle_Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        //Khoi tao co tham so
        Cylinder cylinder1 = new Cylinder(2.0, 10, "red");
        System.out.println(cylinder1);

        //Khoi tao khong tham so
        Cylinder cylinder2 = new Cylinder();
        cylinder2.setRadius(5);
        cylinder2.setHeight(7);
        cylinder2.setColor("blue");
        System.out.println(cylinder2);
    }
}
