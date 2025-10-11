class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        """
        sort intervals and use two pointers i and j starting from the left side of the array
        for i in range until n - 1:
            note that j = i + 1
            1. check if i[end] < j[start]: then append i to res and incr both i and j
            2. else merge
        """
        intervals = sorted(intervals, key=lambda x: x[0])
        res = []
        i = 0
        n = len(intervals)
        while i < n - 1:
            j = i + 1
            if intervals[i][1] < intervals[j][0]:
                res.append(intervals[i])
                i += 1
            else:
                intervals[j][0] = min(intervals[i][0], intervals[j][0])
                intervals[j][1] = max(intervals[i][1], intervals[j][1])
                i += 1
        
        res.append(intervals[-1])
        return res
        