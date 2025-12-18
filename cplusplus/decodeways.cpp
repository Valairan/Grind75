#include <iostream>
#include <vector>
#include <unordered_map>
#include <string>

using namespace std;

int decodeways(const string &s)
{
    if (s.empty() || s.length() == 0 || s.at(0) == '0')
        return 0;

    int n = s.length();
    vector<int> dp(n + 1, 0);
    dp[0] = 1;
    dp[1] = 1;

    for (int i = 2; i <= n; i++)
    {
        if (s.at(i - 1) != '0')
            dp[i] += dp[i - 1];

        int two = stoi(s.substr(i - 2, 2)); //start index and substring length
        if (two >= 10 && two <= 26)
        {
            dp[i] += dp[i - 2];
        }
    }

    return dp[n];
}

int main()
{
    string s = "226";
    cout<< "Number of decodings: " << decodeways(s) << endl;
    return 0;
}
