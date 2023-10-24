package Algorithm_module_2;

public class palindrome {
    public static void main(String[] args) {
        String inputString = "abdcba";
        System.out.println(solution(inputString));
    }
    public static boolean solution(String inputString) {
        boolean result = true;
        for(int i = 0 ; i < inputString.length(); i++){
            if(inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)){
                result = false;
            }
        }
        return result;
    }
}
