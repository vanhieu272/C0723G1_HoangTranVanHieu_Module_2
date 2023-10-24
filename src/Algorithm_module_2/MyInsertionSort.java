package Algorithm_module_2;

import java.util.Arrays;
import java.util.Scanner;

public class MyInsertionSort {
    static void insertionSort(int arr[]) {
        int key;
        int j;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) Math.floor(Math.random() * size);
        }
        System.out.println("Array before sort :" + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Array after sort: " + Arrays.toString(arr));
    }
}

