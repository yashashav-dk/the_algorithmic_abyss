class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # approach for 3 sum 
        ''' 
        step1: sort the array in place 
        step2: fix one (x) variable and use the other two variables to solve two sum 
        step3: use the new variable to recalibtrate the target
        step4: run two sum with sorted array on that keeping track of the duplicates
        '''
        nums = sorted(nums)
        results = []
        n = len(nums)
        for i in range(0, n-2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            
            l = i + 1
            r = n - 1

            while(l < r):
                s = nums[i] + nums[l] + nums[r]
                if s == 0:
                    results.append([nums[i], nums[l], nums[r]])
                    while l < r and nums[l] == nums[l+1]:
                        l += 1
                    while l < r and nums[r] == nums[r-1]:
                        r -= 1
                    l += 1
                    r -= 1
                if s < 0:
                    l += 1
                if s > 0:
                    r -= 1
        return results
