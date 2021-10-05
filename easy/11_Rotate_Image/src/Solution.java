import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        for (int[] m : matrix) {
            System.out.println(Arrays.toString(m));
        }
    }

    public static void rotate(int[][] matrix) {
        transpose(matrix);
        reflect(matrix);
    }

    private static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = i; j < matrix.length; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private static void reflect(int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix.length / 2; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
}
