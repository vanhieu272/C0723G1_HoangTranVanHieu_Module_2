package ss02_Loop_in_java.bai_tap;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Draw rectangle");
            System.out.println("2. Draw square triangle");
            System.out.println("3. Draw isosceles triangle");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.print("\n");
                        for (int j = 0; j < 6; j++) {
                            System.out.print(" * ");
                        }
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        System.out.print("\n");
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("\n");

                    for (int i = 0; i < 5; i++) {
                        System.out.print("\n");
                        for (int j = 5; j > i; j--) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("\n");

                    for (int i = 0; i < 5; i++) {
                        System.out.print("\n");
                        for (int j = 4; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("\n");

                    for (int i = 0; i < 5; i++) {
                        System.out.print("\n");
                        for (int j = 0; j <= i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k <= 5 - i - 1; k++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        System.out.print("\n");
                        for (int j = 0; j <= 5 + i; j++) {
                            if (j < 5 - i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!!");
            }
        }
    }
}
