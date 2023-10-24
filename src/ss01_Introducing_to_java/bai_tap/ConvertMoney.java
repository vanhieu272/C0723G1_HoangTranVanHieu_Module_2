package ss01_Introducing_to_java.bai_tap;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        double vnd;
        double usd;
        double rate;
        Scanner sc = new Scanner(System.in);

        rate = 23000;
        System.out.println("Currency From USD: ");
        usd = sc.nextDouble();
        vnd = usd * rate;
        System.out.println("To VND: " + vnd);
    }
}
