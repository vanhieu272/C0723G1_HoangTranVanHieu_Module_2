package ss18_Regular_Expresion.bai_tap;

import java.util.Scanner;

public class PhoneNumberTest {
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter phone number: ");
            String nameOfClass = scanner.nextLine();
            if (phoneNumber.validate(nameOfClass)) {
                System.out.println("Valid!!");
                break;
            } else {
                System.out.println("Invalid!!");
            }
        }while (true);
    }
}
