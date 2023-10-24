package ss13_Searching_Algorithm.thuc_hanh;

public class BinaryTreeSearch {
    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,12,14,15,16,17};
        System.out.println(binarySearch(arr, 14));
    }
}
