public class climbingstairs

{
	public static void main(String[] args) {
        int  n = 6;
        System.out.println(climbStairsRecursive(n));
        System.out.println(climbStairsWithMemo(n));
	}

    
    public static int climbStairsRecursive(int n){
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 3;
        
        return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
    }
    
    public static int climbStairsWithMemo(int n){
        int [] memo = new int[n+1];
        return memoHelper(n, memo);
    }
    
    
    private static int memoHelper(int n, int[] memo){
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 3;
    
        if(memo[n] != 0){
            return memo[n];
        }
        
        memo[n] = memoHelper(n-1, memo) + memoHelper(n-2, memo);
        return memo[n];
    }
    
}
