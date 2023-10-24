package Algorithm_module_2;

import java.util.Arrays;

public class MyQuickSort {

    // Hàm nhận phần tử cuối cùng làm chốt,
    // đặt các phần tử nhỏ hơn chốt ở trước
    // và lớn hơn ở sau nó
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index của phần tử bé hơn
        for (int j = low; j < high; j++) {

            // Nếu phần tử hiện tại nhỏ hơn chốt
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] và arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i+1] và arr[high] (hoặc pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    // arr[] --> Mảng cần được sắp xếp,
    // low --> chỉ mục bắt đầu,
    // high --> chỉ mục kết thúc
    static void sort(int arr[], int low, int high) {
        if (low < high) {

            // pi là chỉ mục của chốt, arr[pi] vị trí của chốt
            int pi = partition(arr, low, high);

            // Sắp xếp đệ quy các phần tử
            // trước phân vùng và sau phân vùng
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
    public static void main(String args[]) {
        int arr[] = {10, 80, 30, 90, 40, 50, 70};
        int n = arr.length;

        System.out.println("Mảng ban đầu:");
        System.out.println(Arrays.toString(arr));



        MyQuickSort.sort(arr, 0, n - 1);

        System.out.println("Mảng sau khi sắp xếp:");
        System.out.println(Arrays.toString(arr));

    }
}

