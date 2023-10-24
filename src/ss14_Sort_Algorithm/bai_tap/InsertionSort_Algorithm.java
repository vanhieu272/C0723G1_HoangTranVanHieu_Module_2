package ss14_Sort_Algorithm.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort_Algorithm {
    public static void insertionSort(int[] arr) {
        int x;
        int j;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > x) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = x;
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

