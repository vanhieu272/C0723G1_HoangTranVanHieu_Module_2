package algorithm;

import java.util.Arrays;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println(Bai2.findMaxNumber(1011));
        System.out.println(Bai2.findMaxNumber(8714));
        System.out.println(Bai2.findMaxNumber(9371));
    }

    public static String removeCharAt(String s, int position) {
        return s.substring(0, position) + s.substring(position + 1);
    }

    public static int findMaxNumber(int number) {
        String str = "" + number;
        int[] arr = new int[str.length()];
        int max = 0;
        if (number < 1000 || number > 9999) {
            return -1;
        } else {
            for(int i = 0; i < str.length(); i++){
                arr[i] = Integer.parseInt(removeCharAt(str,i));
            }
            max = arr[0];
            for(int i = 1; i < arr.length; i++){
                if(max < arr[i]){
                    max = arr[i];
                }
            }
        }
        return max;
    }
}
