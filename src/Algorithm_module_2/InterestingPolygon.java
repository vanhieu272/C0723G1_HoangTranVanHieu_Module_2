package Algorithm_module_2;

public class InterestingPolygon {
    public static void main(String[] args) {
        System.out.println(interestingPolygon(3));
    }

    public static int interestingPolygon(int n){
        return n * n + (n - 1) * ( n - 1);
    }
}
