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
        int size = matrix.length;

        for (int i = 0; i < size / 2; ++i) {
            for (int j = i; j < size - 1 - i; ++j) {
                int holder;

                holder = matrix[j][size - 1 - i];
                matrix[j][size - 1 - i] = matrix[i][j];
                matrix[i][j] = holder;

                holder = matrix[size - 1 - i][size - 1 - j];
                matrix[size - 1 - i][size - 1 - j] = matrix[i][j];
                matrix[i][j] = holder;

                holder = matrix[size - 1 - j][i];
                matrix[size - 1 - j][i] = matrix[i][j];
                matrix[i][j] = holder;
            }
        }
    }
}
