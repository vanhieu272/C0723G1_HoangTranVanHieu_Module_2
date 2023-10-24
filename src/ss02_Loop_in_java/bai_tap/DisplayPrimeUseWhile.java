package ss02_Loop_in_java.bai_tap;

import java.util.Scanner;

public class DisplayPrimeUseWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count = 0, prime = 2;
        boolean isPrime;

        System.out.println("Enter number of Prime numbers: ");
        num = sc.nextInt();

        while (count < num) {
            int temp = 0;
            for (int i = 1; i <= Math.sqrt(prime); i++) {
                if (prime % i == 0) {
                    temp++;
                }
            }
            isPrime = temp < 2;
            if (isPrime) {
                System.out.println(prime);
                count++;
            }
            prime++;
        }
    }
}

