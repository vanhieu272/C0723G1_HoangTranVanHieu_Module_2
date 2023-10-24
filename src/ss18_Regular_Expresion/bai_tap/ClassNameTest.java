package ss18_Regular_Expresion.bai_tap;

import java.util.Scanner;

public class ClassNameTest {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter class name: ");
            String nameOfClass = scanner.nextLine();
            if (className.validate(nameOfClass)) {
                System.out.println("Valid!!");
                break;
            } else {
                System.out.println("Invalid!!");
            }
        }while (true);
    }
}
