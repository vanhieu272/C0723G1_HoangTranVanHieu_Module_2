package ss02_Loop_in_java.thuc_hanh;
import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, count = 0;

        System.out.println("Enter number: ");
        number = sc.nextInt();

        for(int i = 1; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                count++;
            }
        }
        if(number < 2){
            System.out.printf("%d is not a prime number", number);
            return;
        }
        if(count < 2){
            System.out.printf("%d is a prime number", number);
        }else {
            System.out.printf("%d is not a prime number", number);
        }
    }
}
