def coinchange(coins, target):
    
    dp = [target + 1] * (target + 1)
    dp[0]=0

    for i in range(1, target + 1):
        for coin in coins:
            if(coin <= i):
                dp[i] = min(dp[i], dp[i - coin]+ 1)
                print(str(i) + " | "+ str(dp[i]))
                 

    if dp[target] > target:
        return -1
    else:
        return dp
    
print(coinchange([1, 2, 5], 11))