public class jumpgame {

    public static void main(String[] args) {

        int[] test1 = { 2, 3, 1, 1, 4 };
        System.out.println(canJump(test1)); // true

        int[] test2 = { 3, 2, 1, 0, 4 };
        System.out.println(canJump(test2)); // false
    }

    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                // Can't reach this index
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        return true; // If we never got stuck
    }
}
