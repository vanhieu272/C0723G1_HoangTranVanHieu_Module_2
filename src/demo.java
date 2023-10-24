
import java.util.Scanner;

public class demo {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        long gth = 1;

        do {
            try {
                System.out.println("Enter number: ");
                a = Integer.parseInt(scanner.nextLine());
                if (a >= 0 && a <= 20) {
                    break;
                } else {
                    System.out.println("input number must be >= 0 and <= 20");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Format!!");
            } catch (Exception e) {
                System.out.println("Some error");
            }
        } while (true);


        for (int i = 1; i <= a; i++) {
            gth = gth * i;
        }
        System.out.println(gth);

        String str = "" + gth;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != '0') {
                System.out.println(str.charAt(i));
                break;
            }
        }

    }
}



