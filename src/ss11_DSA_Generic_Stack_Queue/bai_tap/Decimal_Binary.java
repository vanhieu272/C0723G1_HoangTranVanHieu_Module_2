package ss11_DSA_Generic_Stack_Queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class Decimal_Binary {
    Stack<Integer> stackOfDecimal = new Stack<>();

    public String convertDecimalToBinary(int decimalNumber) {
        int tempNumber;
        String result = "";
        do {
            tempNumber = decimalNumber % 2;
            stackOfDecimal.push(tempNumber);
            decimalNumber = decimalNumber / 2;
        } while (decimalNumber > 0);
        int size = stackOfDecimal.size();
        for(int i = 0; i < size; i++){
            result += stackOfDecimal.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Decimal_Binary objConvert = new Decimal_Binary();
        System.out.println("Enter decimal number: ");
        int number = scanner.nextInt();
        System.out.println(number + " convert to binary is: " + objConvert.convertDecimalToBinary(number));

    }
}
