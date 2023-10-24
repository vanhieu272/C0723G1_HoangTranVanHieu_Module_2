package Algorithm_module_2;

public class mangtang {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,3};
        int [] b = new int[]{};
        System.out.println(solution(a));
        System.out.println(solution(b));
    }

    public static boolean solution(int[] a) {
        int index = 1;
        int sum1 = 0;
        int sum2 = 0;
        boolean result = false;
        for (index = 1; index < a.length ; index++) {
            for (int i = 0; i < index; i++) {
                sum1 += a[i];
            }
            for (int j = index + 1; j < a.length; j++) {
                sum2 += a[j];
            }
            if (sum1 == sum2) {
                result = true;
                break;
            }else{
                sum1 = 0;
                sum2 = 0;
            }
        }
        return result;
    }

}
