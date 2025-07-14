#Array
def product_except_self(nums):
    n = len(nums)
    answer = [1] * n

    # Calculate left products
    left_product = 1
    for i in range(n):
        answer[i] = left_product
        left_product *= nums[i]

    # Calculate right products and multiply with left products
    right_product = 1   
    for i in range(n-1, -1, -1):
        print (i)
        answer[i] *= right_product
        right_product *= nums[i]

    return answer

# Test case
nums = [1, 2, 3, 4]
print(product_except_self(nums)) # Output: [24, 12, 8, 6]