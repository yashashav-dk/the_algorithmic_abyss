class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        mySet = set()
        found = False
        for num in nums:
            if num in mySet:
                found = True
                break
            mySet.add(num)
        return found