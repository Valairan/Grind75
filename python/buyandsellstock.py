def buyandsell(prices):
    minprice = float('inf')
    maxprofit = 0

    for price in prices:
        if price< minprice:
            minprice = price

        profit = price - minprice

        if profit > maxprofit:
            maxprofit = profit
    return maxprofit

print(buyandsell([7,1,5,3,6,4]))
print(buyandsell([7,6,4,3,1]))


