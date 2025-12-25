class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        """
        1.  x + y = target; lets make it target - y = x; let's find x in a table/set

        """

        seen = {}
        target_list = []
        for idx in range(len(nums)):
            num = nums[idx]
            diff = target - num
            if diff in seen:
                target_list.append(seen[diff])
                target_list.append(idx)
            else:
                seen[num] = idx

        return target_list
