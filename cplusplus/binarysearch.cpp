/*

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
*/

#include <iostream>
#include <vector>
using namespace std;

void main()
{
    vector<int> list = {1, 2, 5, 7, 8, 9};
}

int binarySearch(int searchTerm, int)
{
}