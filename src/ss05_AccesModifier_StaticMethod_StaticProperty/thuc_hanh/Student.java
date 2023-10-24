package ss05_AccesModifier_StaticMethod_StaticProperty.thuc_hanh;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.change();

        Student std1 = new Student(111, "Hoang");
        Student std2 = new Student(112, "Van");
        Student std3 = new Student(113, "Hieu");

        std1.display();
        std2.display();
        std3.display();

    }
}
