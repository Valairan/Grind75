public class decodeways {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(numDecodings("12341625"));
    }

    public static int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0')
            return 0;

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1; // Base case: empty string
        dp[1] = 1; // First char already validated

        for (int i = 2; i <= n; i++) {
            // Single digit
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }

            // Two digits
            int two = Integer.parseInt(s.substring(i - 2, i));
            if (two >= 10 && two <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
}
