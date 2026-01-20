def merge(list1, list2):
    result = []
    i, j = 0, 0

    while i <len(list1) and j< len(list2):
        if list1[i] <= list2[j]:
            result.append(list1[i])
            i+=1
        else:
            result.append(list2[j])
            j+=1
    
    result.extend(list1[i:])
    result.extend(list2[j:])

    return result

print(merge([1,3,5,7,9], [1, 2,4,6,8, 21, 22, 23]))

