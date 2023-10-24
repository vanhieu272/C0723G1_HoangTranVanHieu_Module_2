package Algorithm_module_2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class MySelectionSort {
   public static int[] selectionSort(int[] arr)
    {
        if(arr.length == 0 || arr.length < 1 || arr.length > 1000){
            return null;
        }
        for (int i = 0; i < arr.length - 1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx] && arr[j] != -1 && arr[min_idx] != -1) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) Math.floor(Math.random() * -11);
        }
        System.out.println("Array before sort :" + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Array after sort: " + Arrays.toString(arr));
    }
}
