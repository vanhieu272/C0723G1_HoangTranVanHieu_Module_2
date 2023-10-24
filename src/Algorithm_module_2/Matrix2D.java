package Algorithm_module_2;

public class Matrix2D {
    static int solution(int[][] matrix) {
        int sum = 0;
        int m = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length - 1; i++){
            for (int k = 0; k < matrix[i].length - 1; k++) {
                if (matrix[i][k] == 0) {
                    m += matrix[i + 1][k];
                }
            }
        }
        return sum - m;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {10, 0, 1},
                {2, 2, 0},
                {5, 3, 1}
        };
        System.out.println(solution(matrix));
    }
}
/*cho mảng 2 chiều, tìm sum của các phần tử sao cho phần tử đó không nằm bên dưới phần tử có giá trị = 0 */