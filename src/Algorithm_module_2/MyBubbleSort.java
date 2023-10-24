package Algorithm_module_2;

import java.util.Arrays;
import java.util.Scanner;

public class MyBubbleSort {
    static void bubbleSort(int[] arr) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j+1]
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
                // If no two elements were
                // swapped by inner loop, then break
                if (!swapped)
                    break;
            }
        }
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter array's size: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = (int) Math.floor(Math.random() * -10);
            }
            System.out.println("Array before sort :" + Arrays.toString(arr));
            bubbleSort(arr);
            System.out.println("Array after sort: " + Arrays.toString(arr));
        }
    }
