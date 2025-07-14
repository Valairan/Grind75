#Insert Intervals - Intervals
def insert(intervals, newInterval):
    result = []
    i = 0
    n = len(intervals)
    
    # Step 1: Add all intervals that come before the new interval
    while i < n and intervals[i][1] < newInterval[0]:
        result.append(intervals[i])
        i += 1
    
    # Step 2: Merge overlapping intervals
    while i < n and intervals[i][0] <= newInterval[1]:
        newInterval[0] = min(newInterval[0], intervals[i][0])
        newInterval[1] = max(newInterval[1], intervals[i][1])
        i += 1
    result.append(newInterval)
    
    # Step 3: Add all intervals that come after the new interval
    while i < n:
        result.append(intervals[i])
        i += 1
    
    return result

intervals = [[1,2],[3,10],[12,16]]
newInterval = [4,8]

print (insert(intervals, newInterval))