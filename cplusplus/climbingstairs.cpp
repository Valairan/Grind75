#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

int climbingStairsRecursive(int n)
{
    if (n == 1)
        return 1;
    if (n == 2)
        return 2;
    if (n == 3)
        return 3;
    return climbingStairsRecursive(n - 1) + climbingStairsRecursive(n - 2);
}

int climbingStairsWithDP(int n)
{
    int prev1 = 1;
    int prev2 = 2;

    for (int i = 2; i < n; i++)
    {
        int current = prev1 + prev2;
        prev2 = prev1;
        prev1 = current;
    }

    return prev1;
}

int main()
{
    int start = 7;
    cout << "Number of ways to climb the stairs through recursion: " << climbingStairsRecursive(start) << endl;
    cout << "Number of ways to climb the stairs through DP: " << climbingStairsWithDP(start) << endl;
    return 0;
}
