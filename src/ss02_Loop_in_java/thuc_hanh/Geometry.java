package ss02_Loop_in_java.thuc_hanh;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.print("\n");
                        for (int j = 5; j > i; j--) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        System.out.print("\n");
                        for (int j = 0; j < 5; j++) {
                            System.out.print(" * ");
                        }
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    for (int i = 0; i < 3; i++) {
                        System.out.print("\n");
                        for (int j = 0; j < 6; j++) {
                            System.out.print(" * ");
                        }
                    }
                    System.out.println("\n");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");

            }
        }
    }
}
