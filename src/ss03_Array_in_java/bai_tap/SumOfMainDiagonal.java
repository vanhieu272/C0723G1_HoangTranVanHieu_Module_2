package ss03_Array_in_java.bai_tap;

import java.util.Scanner;

public class SumOfMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        double sum = 0;
        System.out.println("Square matrix has the number of rows = columns");
        System.out.println("Enter the number of rows and columns: ");
        size = scanner.nextInt();

        double[][] array = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Enter the element [%d][%d]: ", i, j);
                array[i][j] = scanner.nextDouble();
                if (j == i) {
                    sum += array[i][j];
                }
            }
        }
        System.out.print("\nMatrix = ");
        for (int i = 0; i < size; i++) {
            System.out.print("\n");
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }

        System.out.printf("\nSum of main diagonal: %f", sum);
    }
}
