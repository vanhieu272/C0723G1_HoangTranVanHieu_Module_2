package ss01_Introducing_to_java.bai_tap;

import java.util.Scanner;

public class ReadNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        String[] zeroToNine = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] tenToNineteen = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        int units = number % 10;
        int hundreds = number / 100;
        int dozens = (number % 100) / 10;

        if (number >= 0 && number < 1000) {
            if (hundreds == 0) {
                if (dozens == 0) {
                    System.out.printf(number + " read as: " + zeroToNine[units]);
                } else if (dozens == 1) {
                    System.out.printf(number + " read as: " + tenToNineteen[units]);
                } else if (units == 0) {
                    System.out.printf(number + " read as: " + tens[dozens - 1]);
                } else {
                    System.out.printf(number + " read as: " + tens[dozens - 1] + " " + zeroToNine[units]);
                }
            } else {
                if (dozens == 0 && units == 0) {
                    System.out.printf(number + " read as: " + zeroToNine[hundreds] + " hundred");
                } else if (dozens == 0) {
                    System.out.printf(number + " read as: " + zeroToNine[hundreds] + " hundred and " + zeroToNine[units]);
                } else if (units == 0) {
                    System.out.printf(number + " read as: " + zeroToNine[hundreds] + " hundred and " + tens[dozens - 1]);
                } else {
                    if (dozens == 1) {
                        System.out.println(number + " read as: " + zeroToNine[hundreds] + " hundred and " + tenToNineteen[units]);
                    } else {
                        System.out.println(number + " read as: " + zeroToNine[hundreds] + " hundred and " + tens[dozens - 1] + " " + zeroToNine[units]);
                    }
                }
            }
        }
    }
}