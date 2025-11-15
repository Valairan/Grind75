import java.util.Stack;

public class maximalsquare {

    public static void main(String[] args) {
        char[][] matrix = {
                { '1', '0', '1', '0', '0' },
                { '1', '0', '1', '1', '1' },
                { '1', '1', '1', '1', '1' },
                { '1', '0', '0', '1', '0' }
        };
        System.out.println(maximalRectangle(matrix)); // Output: 4
        System.out.println(maximalSquare(matrix)); // Output: 4
    }

    public static int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return 0;
        int m = matrix.length;
        int n = matrix[0].length;

        int[] height = new int[n];
        int[] left = new int[n]; // initialize to 0
        int[] right = new int[n]; // initialize to n
        for (int i = 0; i < n; i++)
            right[i] = n;

        int maxArea = 0;

        for (int i = 0; i < m; i++) {
            int curLeft = 0, curRight = n;

            // update heights
            for (int j = 0; j < n; j++) {
                height[j] = (matrix[i][j] == '1') ? height[j] + 1 : 0;
            }

            // update left
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    left[j] = Math.max(left[j], curLeft);
                } else {
                    left[j] = 0;
                    curLeft = j + 1;
                }
            }

            // update right
            for (int j = n - 1; j >= 0; j--) {
                if (matrix[i][j] == '1') {
                    right[j] = Math.min(right[j], curRight);
                } else {
                    right[j] = n;
                    curRight = j;
                }
            }

            // compute area
            for (int j = 0; j < n; j++) {
                maxArea = Math.max(maxArea, (right[j] - left[j]) * height[j]);
            }

        }

        return maxArea;
    }

    public static int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];
        int maxSide = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == '1') {

                    // First row or first column case
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = 1 + Math.min(
                                dp[i - 1][j], // top
                                Math.min(
                                        dp[i][j - 1], // left
                                        dp[i - 1][j - 1] // top-left
                                ));
                    }

                    maxSide = Math.max(maxSide, dp[i][j]);
                }
            }
        }

        return maxSide * maxSide; // area
    }


}
