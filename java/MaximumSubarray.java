public class maximumsubarray
{
	public static void main(String[] args) {
        int[] n = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	    
	    System.out.println(maxSubArrayBasic(n));
	    
	    
	}
    
    public static int maxSubArrayBasic(int[] nums){
        int currentMax = nums[0];
        int globalMax = nums[0];
        
        for (int i = 1; i < nums.length; i++){
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            
            globalMax = Math.max(globalMax, currentMax);
        }
        
        return globalMax;
    }
    
    public static int maxSubArrayDaC(int[] nums){
        return divide(nums, 0, nums.length - 1);
    }
    
    private static int divide (int[] nums, int left, int right){
        if(left == right) return nums[left];
        
        int mid = left + (right - left) / 2;
        
        int leftMax = divide(nums, left, mid);
        int rightMax = divide(nums, mid + 1, right);
        int crossMax = maxCrossing(nums, left, mid, right);
        
        return Math.max(Math.max(leftMax, rightMax), crossMax);
    }  
    
    private static int maxCrossing(int[] nums, int left, int mid, int right){
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        
        int sum = 0;
        
        for (int i = mid; i >= left; i --){
            sum += nums[i];
            rightSum = Math.max(rightSum, sum);
        }
        
        sum = 0;
        for (int i = mid + 1; i <= right; i++){
            sum += nums[i];
            rightSum = Math.max(rightSum, sum);
        }
        
        return leftSum + rightSum;
    }
}
