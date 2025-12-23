#include <iostream>
#include <vector>
#include <unordered_map>
#include "util.h"
using namespace std;

int combinationSum(vector<int> &nums, int target)
{
    vector<int> dp(target + 1);
    dp[0] = 1;

    for (int i = 1; i <= target; i++)
    {
        for (int num : nums)
        {
            if (i - num >= 0)
            {
                dp[i] += dp[i - num];
            }

        }
    }
    print (dp);
    return dp[target];
}

int main()
{
    vector<int> nums = {2, 7, 9, 3, 1};
    int target = 6;
    cout << combinationSum(nums, target);
    return 0;
}
