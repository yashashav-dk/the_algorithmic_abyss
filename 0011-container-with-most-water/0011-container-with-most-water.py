class Solution:
    def maxArea(self, height: List[int]) -> int:
        area = 0
        i = 0
        j = len(height) - 1
        while(i < j):
            i_ele = height[i]
            j_ele = height[j]
            new_area = min(i_ele, j_ele) * (j - i)
            area = max(area, new_area)

            if (i_ele > j_ele):
                j -= 1
            else:
                i += 1
        
        return area