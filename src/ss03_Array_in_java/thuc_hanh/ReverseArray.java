package ss03_Array_in_java.thuc_hanh;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        int i = 0;

        do {
            System.out.println("Enter size of array: ");
            size = sc.nextInt();
        } while (size > 20);

        array = new int[size];
        do {
            System.out.println("Enter element " + i);
            array[i] = sc.nextInt();
            i++;
        } while (i < array.length);

        System.out.print("Array = ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int temp, first = 0, last = array.length - 1;
        for (int j = 0; j < array.length / 2; j++) {
            temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }

        System.out.print("Reversed array = ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
