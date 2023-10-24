package ss02_Loop_in_java.bai_tap;

public class PrimeNumberLessThan100 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean checkPrime(int number) {
        int count = 0;
        boolean result = false;
        if (number >= 2) {
            for (int i = 1; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    count++;
                }
                result = count < 2;
            }
        }
        return result;
    }
}

