package Algorithm_module_2;

import java.util.Arrays;
import java.util.Scanner;

public class FindSum2ElementsInArray {
    public static int [] findSumofTarget(int [] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length; j++){
                if (arr[i] + arr[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int size = scanner.nextInt();
        int target;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) Math.floor(Math.random() * size);
        }
        System.out.println("Array :" + Arrays.toString(arr));
        System.out.println("Enter target number: ");
        target = scanner.nextInt();
        System.out.println(Arrays.toString(findSumofTarget(arr, target)));

    }
}

/* Tìm index 2 số trong một mảng có tổng bằng một số target cho trước */
