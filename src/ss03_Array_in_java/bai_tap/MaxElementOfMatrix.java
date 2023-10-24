package ss03_Array_in_java.bai_tap;

import java.util.Scanner;

public class MaxElementOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int column;

        System.out.println("Enter the number of rows: ");
        row = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        column= scanner.nextInt();
        int[][] array = new int[row][column];
        for(int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.printf("Enter the element [%d][%d]: ", i,j);
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.print("\nMatrix = ");
        for(int i = 0; i < row; i++){
            System.out.print("\n");
            for (int j = 0; j < column; j++){
                System.out.print(array[i][j] + "\t");
            }
        }

        int max = array[0][0];
        for(int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println("\nMax value in matrix: " +max);
    }
}
