class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        """
        Approach: sort + two pointers
        1. loop 1: fix i -> during incr ensure you skip duplicates 
        2. inner loop: increment left and right accordingly
            on target hit - append to results and incre i and decr j
        """
        nums.sort()
        results = []
        for i in range(len(nums)):
            if nums[i] > 0: break
            if (i > 0 and nums[i] == nums[i-1]): continue
            left = i + 1
            right = len(nums) - 1
            while left < right:
                target = nums[i] + nums[left] + nums[right]
                if target > 0:
                    right -= 1
                elif target < 0:
                    left += 1
                else:
                    results.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1
                    # eradicate duplicates and increment
                    while(left < right and nums[left] == nums[left - 1]):
                            left += 1
                    while(left < right and nums[right] == nums[right + 1]):
                            right -= 1
                    
        return results

        