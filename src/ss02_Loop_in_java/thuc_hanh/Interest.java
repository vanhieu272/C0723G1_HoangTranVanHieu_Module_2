package ss02_Loop_in_java.thuc_hanh;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        double totalInterest = 0;

        System.out.println("Enter investment amount: ");
        money = sc.nextDouble();

        System.out.println("Enter number of month(s): ");
        month = sc.nextInt();

        System.out.println("Enter the interest rate: ");
        interestRate = sc.nextDouble();

        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate * 100) / 12 *month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
