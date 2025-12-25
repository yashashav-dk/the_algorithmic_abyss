class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        """
        Approach 1: Use a frequency counter using fixed arrays
        Approach 2: Build a map 
        Approach 3: Sort them and do a one pass check comparing indices
        """

        table = [0] * 26

        for idx in range(len(s)):
            alpha_idx = ord(s[idx]) - ord('a')
            table[alpha_idx] += 1
        
        for idx in range(len(t)):
            alpha_idx = ord(t[idx]) - ord('a')
            table[alpha_idx] -= 1

        isAna = True

        for char in table:
            if char < 0 or char > 0:
                return False
        
        return isAna