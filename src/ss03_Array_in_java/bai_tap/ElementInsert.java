package ss03_Array_in_java.bai_tap;

import java.util.Scanner;

public class ElementInsert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int index;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0};
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        do {
            System.out.println("\nEnter the element you want to insert: ");
            number = scanner.nextInt();
            System.out.println("Enter the position: ");
            index = scanner.nextInt();
            if (index < 0 || index > array.length) {
                System.out.println("Please enter the appropriate position with array length!!");
            } else {
                insertElement(array, index, number);
                break;
            }
        } while (true);
    }

    public static void insertElement(int[] array, int index, int number) {
        for (int i = array.length - 2; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = number;
        System.out.printf("Array after insert %d at position %d:  ", number, index);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}


