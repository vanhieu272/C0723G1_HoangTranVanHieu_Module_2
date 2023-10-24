package ss03_Array_in_java.bai_tap;

import java.util.Scanner;

public class ElementDelete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {0, 0, 1, 2, 0, 4, 5, 5, 6, 7, 8, 8, 9, 5, 6, 0, 0};
        int number;

        System.out.print("Array =  ");
        showArray(array);
        System.out.print("\nEnter the element want to delete: ");
        number = scanner.nextInt();
        delValue(number, array);
    }

    public static void delValue(int number, int[] array) {
        String result = "Not found";
        int lastIndex = array.length;
        for (int i = 0; i < lastIndex; i++) {
            if (array[i] == number) {
                array[i] = 0;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                    array[j + 1] = 0;
                }
                i--;
                lastIndex--;
                result = "";
            }
        }
        if (result.equals("Not found")) {
            System.out.println(result);
        } else {
            showArray(array);
        }
    }

    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}