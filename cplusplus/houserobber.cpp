#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

int rob(vector<int> &nums)
{
    int prev2 = 0;
    int prev1 = 0;

    for (int money : nums)
    {
        int current = max(prev1, prev2 + money);
        prev2 = prev1;
        prev1 = current;
    }

    return prev1;
}

int main()
{
    vector<int> nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    cout << "Maximum robbed: " << rob(nums) << endl;

    return 0;
}
