class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        """
        nums = [        2,         3,         4,         5]
        res =  [       60,        40,        30,        24]
        res =  [(3, 4, 5), (2, 4, 5), (2, 3, 5), (2, 3, 4)]
        left = [       (),       (2),    (2, 3), (2, 3, 4)]
        righ = [(3, 4, 5),    (4, 5),       (5),        ()]

        Approach: Forward Pass + Backward Pass
        1. cumulative product from the left
        2. merge cumulative product from the right

        """

        L = 1
        n = len(nums)
        res = []
        for idx in range(n):
            res.append(L)
            L = L * nums[idx]
        # print(res)
        R = 1
        for idx in range(n - 1, -1, -1):
            res[idx] = res[idx] * R
            R = R * nums[idx]
        return res
        