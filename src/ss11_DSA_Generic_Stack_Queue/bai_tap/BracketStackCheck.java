package ss11_DSA_Generic_Stack_Queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class BracketStackCheck {
    public static boolean checkBracket(String str) {
        Stack<String> stack = new Stack<>();
        String[] stringArray = str.split("");

        for (String value : stringArray) {
            if (value.equals("(")) {
                stack.push(value);
            } else if (value.equals(")")) {
                if (stack.empty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringTest = scanner.nextLine();
        if (checkBracket(stringTest)) {
            System.out.println("String has valid brackets");
        } else {
            System.out.println("String has invalid brackets");
        }
    }
}