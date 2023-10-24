package ss03_Array_in_java.thuc_hanh;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice = -1;
    double celcius, fahrenheit;

    do{
        System.out.println("Menu");
        System.out.println("1. Celcius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celcius");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter the celcius degree: ");
                celcius = sc.nextDouble();
                System.out.println(celcius + " C = " + convertCtoF(celcius) + " F");
                break;
            case 2:
                System.out.println("Enter the fahrenheit degree: ");
                fahrenheit = sc.nextDouble();
                System.out.println(fahrenheit + " F = " + convertFtoC(fahrenheit) + " C");
                break;
            case 0:
                System.exit(0);
        }
    }while (choice != 0);


    }

    public static double convertCtoF(double celcius){
        double fahrenheit;
        fahrenheit = (9.0 / 5) * celcius + 32;
        return fahrenheit;
    }

    public static double convertFtoC(double fahrenheit) {
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        return celcius;
    }
}
