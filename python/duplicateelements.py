areThereDuplicates = lambda arr : len(set(arr)) == len(arr)

def getFirstDuplicate(arr):
    seen = set()
    for i in arr:
        if i in seen:
            return i
        else:
            seen.add(i)
    return -1

def getAllDuplicates(arr):
    seen = set()
    duplicates = set()
    for i in arr:
        if i in seen:
            duplicates.add(i)            
        else:
            seen.add(i)

    return list(duplicates)


arr1 = [1,1,2,2,3,4,5]
arr2 = [1,2,3,4,5]

print(areThereDuplicates(arr1))
print(areThereDuplicates(arr2))
print()
print(getFirstDuplicate(arr1))
print(getFirstDuplicate(arr2))
print()
print(getAllDuplicates(arr1))
print(getAllDuplicates(arr2))