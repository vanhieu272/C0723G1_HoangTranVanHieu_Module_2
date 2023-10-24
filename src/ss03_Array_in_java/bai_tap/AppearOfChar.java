package ss03_Array_in_java.bai_tap;

import java.util.Scanner;

public class AppearOfChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringTest = "Goodbye World !!";
        int count = 0;

        System.out.println("Enter the character do you want to find: ");
        char charInput = scanner.next().charAt(0);

        for (int i = 0; i < stringTest.length(); i++) {
            if (charInput == stringTest.charAt(i)) {
                count++;
            }
        }
        if (count > 0) {
            System.out.printf("Character '%s' appear %d times.", charInput, count);
        } else {
            System.out.printf("Character '%s' not found.", charInput);
        }
    }
}

