class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        """
        start = interval[i][0]
        end = interval[i][1]

        start_new = newInterval[0]
        end_new = newInterval[1]
        
        loop until i < n
            check if end < start_new: append and proceed the loop
            check if end_new < start: break and append [start_new, end_new] to results out of loop
            if case is none of the above merge

        come out of loop and append what was pending
        """
        res = []
        i = 0
        n = len(intervals)
        while i < n:
            if intervals[i][1] < newInterval[0]:
                res.append(intervals[i])
            elif newInterval[1] < intervals[i][0]:
                break
            else: # merge and expand newInterval
                newInterval[0] = min(intervals[i][0], newInterval[0])
                newInterval[1] = max(intervals[i][1], newInterval[1])
            i += 1
        res.append(newInterval)
        while i < n:
            res.append(intervals[i])
            i += 1
        return res

        