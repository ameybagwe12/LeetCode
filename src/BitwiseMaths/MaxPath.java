
package BitwiseMaths;
import java.util.*;

class MaxPath {
    public static int maximumPath(int[][] mat, int i, int j) {
        int N = mat.length;

        if (i == N - 1 && j == N - 1)
            return mat[i][j];

        if (i >= N || i < 0 || j >= N || j < 0)
            return 0;

        return Math.max(
                Math.max(maximumPath(mat, i + 1, j), maximumPath(mat, i + 1, j - 1)),
                maximumPath(mat, i + 1, j + 1))
                + mat[i][j];
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {4, 2, 3, 4},
                {2, 9, 1, 10},
                {15, 1, 3, 0},
                {16, 92, 41, 44}
        };

        int N = matrix.length;

        int result = maximumPath(matrix, 0, 0);
        System.out.println("Maximum Path Sum: " + result);
    }
}
