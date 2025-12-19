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


int main()
{
    int start = 7;
    cout << "Number of ways to climb the stairs: " << climbingStairsRecursive(start) << endl;
    return 0;
}
