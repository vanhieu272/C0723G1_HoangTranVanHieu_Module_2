package ss01_Introducing_to_java.thuc_hanh;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bmi, weight, height;

        System.out.println("Nhap chieu cao: ");
        height = sc.nextDouble();
        System.out.println("Nhap can nang: ");
        weight = sc.nextDouble();

        bmi = weight / Math.pow(height, 2);
        if (bmi < 18)
            System.out.printf("Underweight");
        else if (bmi < 25.0)
            System.out.printf("Normal");
        else if (bmi < 30.0)
            System.out.printf("Overweight");
        else
            System.out.printf("Obese");
    }
}

