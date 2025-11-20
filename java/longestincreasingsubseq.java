import java.util.Arrays;

public class longestincreasingsubseq {
    public static void main(String[] args) {
        int[] n = { 10, 9, 2, 5, 3, 7, 101, 18 };

        longestsubsequence(n);
    }

    public static int longestsubsequence(int[] nums) {

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;

        for (int i : dp) {
            max = Math.max(max, i);
        }
        util.printArray(dp);

        return max;
    }
}

