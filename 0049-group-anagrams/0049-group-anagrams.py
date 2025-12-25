class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        table = {}
        for string in strs:
            sorted_string = "".join(sorted(string))
            if sorted_string in table:
                new_list = table[sorted_string]
                new_list.append(string)
                table[sorted_string] = new_list
            else:
                table[sorted_string] = [string]
        res_list = []
        for k, v in table.items():
            res_list.append(v)
        return res_list