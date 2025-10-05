class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        """
        Approach 1: Use hashmap to find the missing element
        x + y = target
        x = target - y
        loop for each element in nums:
            check if x in map
        
        Approach 2: Use two points at extremes and converge
        i and j pointer at 0th idx and -1th idx. But sort beforehand.   
        [2 7 11 15]
        target = 9
        """
        pairs = sorted((v, i) for i, v in enumerate(nums))
        lo, hi = 0, len(nums) - 1

        while (lo < hi):
            ith = pairs[lo][0]
            jth = pairs[hi][0]
            if (ith + jth == target):
                return [pairs[lo][1], pairs[hi][1]]
            elif (ith + jth > target):
                hi -= 1
            else:
                lo += 1
        return []
        


        

        