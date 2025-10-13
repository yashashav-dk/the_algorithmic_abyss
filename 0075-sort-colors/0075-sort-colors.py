class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        """
        store the count of 0, 1, and 2s
        and expand/overrite the existing array
        """

        red = 0
        white = 0
        blue = 0

        for ele in nums:
            if ele == 0:
                red += 1
            elif ele == 1:
                white += 1
            else:
                blue += 1
        
        n = len(nums)
        idx = 0
        while idx < n:
            for rdx in range(red):
                nums[idx] = 0
                idx += 1
            for wdx in range(white):
                nums[idx] = 1
                idx += 1
            for rdx in range(blue):
                nums[idx] = 2
                idx += 1

            

        