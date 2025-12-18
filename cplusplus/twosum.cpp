#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

vector<int> twoSum(vector<int> &nums, int target)
{
    unordered_map<int, int> passed;

    for (int i = 0; i < nums.size(); i++)
    {
        int complement = target - nums[i];

        if (passed.count(complement))
        {
            return {passed[complement], i};
        }
        passed[nums[i]] = i;
    }

    

    return {};
}

int main()
{
    vector<int> nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int target = 9;

    vector<int> result = twoSum(nums, target);

    if (!result.empty())
    {
        cout << "Indices: " << result[0] << " and " << result[1] << endl;
        cout << "Values: " << nums[result[0]] << " + " << nums[result[1]] << " = " << target << endl;
    }

    return 0;
}
