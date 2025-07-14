#Array
def threeSum(nums):
    # Step 1: Sort the array
    nums.sort()
    result = []
    
    # Step 2: Iterate through the array
    for i in range(len(nums) - 2):
        print("--------------------")

        # Skip duplicates for the fixed number
        if i > 0 and nums[i] == nums[i - 1]:
            continue
        
        # Step 3: Two-pointer approach
        left, right = i + 1, len(nums) - 1
        while left < right:
            print(left, right)
            print (nums[i] , nums[left] , nums[right])
            total = nums[i] + nums[left] + nums[right]
            
            if total == 0:
                # Found a triplet
                result.append([nums[i], nums[left], nums[right]])
                
                # Skip duplicates for left and right
                while left < right and nums[left] == nums[left + 1]:
                    left += 1
                while left < right and nums[right] == nums[right - 1]:
                    right -= 1
                
                # Move pointers
                left += 1
                right -= 1
            elif total < 0:
                left += 1  # Increase the sum
            else:
                right -= 1  # Decrease the sum
    
    # Step 5: Return the result
    return result

nums = [-1, 0, 1, 2, -1, -4]
#[-4, -1, -1, 0, 1, 2]
print (threeSum(nums))