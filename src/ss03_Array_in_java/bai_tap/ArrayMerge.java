package ss03_Array_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMerge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[10];

        System.out.println("Enter elements for 1st array");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter element " + i + ": ");
            array1[i] = scanner.nextInt();
        }
        System.out.print("Array 1 = " + Arrays.toString(array1) + "\n");

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter element " + i + ": ");
            array2[i] = scanner.nextInt();
        }
        System.out.print("Array 2 = " + Arrays.toString(array2) + "\n");

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
            array3[i + array1.length] = array2[i];
        }
        System.out.print("\n1st Array + 2nd Array = " + Arrays.toString(array3));


    }
}
