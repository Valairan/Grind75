public class Main
{
public static void main(String[] args) {
        int[] n = {1,2,3};
        int target = 4;
	    
	    System.out.println(combinationSum4(n, target));
	    
	    
	}
    
    public static int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;  // base case

        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (i - num >= 0) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }
}
