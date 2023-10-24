package ss03_Array_in_java.bai_tap;

import java.util.Scanner;

public class MinOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.println("Enter size of array: ");
        size = scanner.nextInt();

        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            System.out.printf("\nEnter element %d: ", i);
            array[i] = scanner.nextInt();
        }
        System.out.print("Array = ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }

        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.print("\nMin value of array: " +min);
    }
}
