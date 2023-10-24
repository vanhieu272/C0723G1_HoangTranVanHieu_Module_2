package ss03_Array_in_java.thuc_hanh;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array;
        int size, i = 0, index = -1;


        do {
            System.out.println("Enter the size of array: ");
            size = sc.nextInt();
        } while (size > 20 || size < 1);

        array = new int[size];
        do {
            System.out.println("Enter the element " + i);
            array[i] = sc.nextInt();
            i++;
        } while (i < array.length);

        System.out.print("Array = ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        for (int j = 1; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
                index = j;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
