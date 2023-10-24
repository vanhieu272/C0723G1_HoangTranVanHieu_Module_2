package ss11_DSA_Generic_Stack_Queue.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String inputString = scanner.nextLine();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        inputString = inputString.toLowerCase();
        String result = "Is a Palindrome";

        for(int i = 0; i < inputString.length(); i++){
            queue.add(inputString.charAt(i));
            stack.push(inputString.charAt(i));
        }

        for (int i = 0; i < stack.size(); i++){
            if (!(queue.remove().equals(stack.pop()))){
                result = "Not a Palindrome string";
                break;
            }
        }
        System.out.println(result);
    }
}
