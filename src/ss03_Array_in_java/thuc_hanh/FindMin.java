package ss03_Array_in_java.thuc_hanh;

public class FindMin {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 5, 12, 14, -10, -8, 6, 32};
        int[] result = minValue(array);

        System.out.print("Array = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println("\nMin value: " + result[0]);
        System.out.println("Position: " + result[1]);
    }

    public static int[] minValue(int[] array) {
        int min = array[0];
        int index = -1;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return new int[]{min, index};
    }
}
