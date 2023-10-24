package ss03_Array_in_java.thuc_hanh;

import java.sql.Array;
import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputName;
        boolean flag = false;
        int index = -1;
        String[] studentArr = {"Toai", "Quyen", "MTuan", "Dat", "Hieu", "ATuan", "Huu", "Tuong", "Hung", "Thuan"};
        System.out.println("Enter student's name: ");
        inputName = sc.nextLine();
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i].equals(inputName)) {
                flag = true;
                index = i;
            }
        }
        if (flag) {
            System.out.printf("Found student %s at position %d ", inputName, index);
        } else {
            System.out.println("Student not found");
        }
    }
}
