package Algorithm_module_2;
import java.util.Scanner;

public class InputYearShowCentury {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        year = sc.nextInt();
        System.out.println("Century: " + solution(year));
        System.out.println("Century: " + solution1(year));
    }

    public static int solution1(int year) {
        if(year % 100 == 0){
            return (year / 100);
        }else {
            return (year / 100) + 1;
        }
    }

    public static int solution(int year){
        return (year + 99) / 100;
    }

}
