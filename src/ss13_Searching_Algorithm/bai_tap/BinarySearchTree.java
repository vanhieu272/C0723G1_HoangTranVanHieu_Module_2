package ss13_Searching_Algorithm.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTree {
    static int searchBinary(int[] array, int left, int right, int value) {
        if(array.length == 0){
            return  -1;
        }
        Arrays.sort(array);
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (array[mid] == value)
                return mid;
            if (array[mid] > value)
                return searchBinary(array, left, mid - 1, value);
            return searchBinary(array, mid + 1, right, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * size);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Enter value need to find: ");
        int value = scanner.nextInt();
        System.out.println(searchBinary(array, 0, array.length - 1, value));
    }
}
