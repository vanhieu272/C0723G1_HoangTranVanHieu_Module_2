package ss13_Searching_Algorithm.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String parentString = scanner.nextLine();

        LinkedList<Character> longestSubString = new LinkedList<>();

        for (int i = 0; i < parentString.length(); i++) {
            LinkedList<Character> listTemp = new LinkedList<>();
            listTemp.add(parentString.charAt(i));
            for (int j = i + 1; j < parentString.length(); j++) {
                if (parentString.charAt(j) > listTemp.getLast()) {
                    listTemp.add(parentString.charAt(j));
                } else {
                    break;
                }
            }
            if (listTemp.size() > longestSubString.size()) {
                longestSubString.clear();
                longestSubString.addAll(listTemp);
            }
        }

        for (Character subString : longestSubString) {
            System.out.print(subString);
        }
    }
}
