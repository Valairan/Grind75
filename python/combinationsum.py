#Dynamic Programming
def combinationSum(candidates, target):
    def backtrack(start, target, path, result):
        if target == 0:
            result.append(list(path))
            return
        if target < 0:
            return
        
        for i in range(start, len(candidates)):
            path.append(candidates[i])
            backtrack(i, target - candidates[i], path, result)
            path.pop()  # Backtrack
    
    result = []
    backtrack(0, target, [], result)
    return result

# Example Usage
candidates = [2, 3, 6, 7]
target = 7

print(combinationSum(candidates, target))
