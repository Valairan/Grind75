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
#include "util.h"
#include <iostream>
#include <vector>
using namespace std;

int binarySearch(vector<int> &nums, int searchterm)
{
    return 0;
}

int main()
{
    vector<int> list = {1, 2, 5, 7, 8, 9};
    int trueSearch = 5;
    int falseSearch = 25;

    print(list);

    int result = binarySearch(list, trueSearch);
    cout << "Element is at " << result << "\n";
    result = binarySearch(list, falseSearch);
    cout << "Element could not be found " << result << "\n";

    return 0;
}


