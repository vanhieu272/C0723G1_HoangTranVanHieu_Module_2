package Algorithm_module_2;

import java.util.Scanner;

public class LowerCaseandSpace {
    public static String solution(String str) {
        String newStr = "";
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                newStr += arr[i].toLowerCase();
            }else if(arr[i] == arr[i].toUpperCase()){
                newStr += " " + arr[i].toLowerCase();
            }else {
                newStr +=arr[i];
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringTest = scanner.nextLine();
        System.out.println(solution(stringTest));
    }
}
