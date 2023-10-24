package ss03_Array_in_java.bai_tap;

import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        int column;
        int columnCount;
        double sum = 0;

        System.out.println("Enter the number of rows: ");
        row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        column = sc.nextInt();
        double[][] array = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Enter the element [%d][%d]: ", i, j);
                array[i][j] = sc.nextDouble();
            }
        }
        System.out.print("\nMatrix = ");
        for (int i = 0; i < row; i++) {
            System.out.print("\n");
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }

        do {
            System.out.println("\nEnter what column do you want to sum: ");
            columnCount = sc.nextInt();
            if (columnCount < 0 || columnCount >= column) {
                System.out.println("Column not found!!. Please try again!!");
            } else {
                for (int i = 0; i < row; i++) {
                            sum += array[i][columnCount];
                }
                System.out.printf("\nSum of column %d: %f", columnCount, sum);
                break;
            }
        } while (true);
    }
}
