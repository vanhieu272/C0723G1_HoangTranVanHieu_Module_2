package Algorithm_module_2;

public class statues {
    public static void main(String[] args) {
        int [] arr = new int[]{2,5,6,8,9,11};
        System.out.println(solution(arr));
    }
    public static int solution(int[] statues) {
        int max = statues[0];
        int min = statues[0];
        for(int i = 1; i < statues.length; i++){
            if(max < statues[i]){
                max = statues[i];
            }
            if(min > statues[i]){
                min = statues[i];
            }
        }
        return (max - min) + 1 - statues.length;
    }

}
