class Solution:
    def minimumBoxes(self, apple: List[int], capacity: List[int]) -> int:
        apple_count = sum(apple)
        cap_rev_sorted = list(reversed(sorted(capacity)))
        print(cap_rev_sorted)
        i = 0
        while(apple_count > 0):
            apple_count -= cap_rev_sorted[i]
            i += 1
        return i