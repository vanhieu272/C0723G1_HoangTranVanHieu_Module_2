package ss14_Sort_Algorithm.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            /* Array may be sorted and next pass not needed */
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = (int) Math.floor(Math.random() * size);
        }
        System.out.println("Array before sort :" + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Array after sort: " + Arrays.toString(arr));
    }
}
