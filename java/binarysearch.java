public class binarysearch {
    public static void main(String[] args) {
        int searchterm = 6;
        int[] array = {1, 2, 3, 5, 6, 8, 10, 24, 56, 77, 110 };
        System.out.println(binarysearch(searchterm, array));
    }

    public static int binarysearch(int searchterm, int[] nums) {
        int left = 0;
        int right = nums.length - 1;        
        
        while (left <= right){
            int mid = left + (right - left) / 2;
            if(searchterm == nums[mid])
                return mid;
            if (searchterm < nums[mid])
                right = mid - 1;
            else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
