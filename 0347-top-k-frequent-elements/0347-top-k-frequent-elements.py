class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        table = {}
        for num in nums:
            count = 0
            if num in table:
                table[num] += 1
            else:
                table[num] = 1
        sorted_table = sorted(table.items(), key=lambda x: x[1], reverse=True)
        res_list = []
        for idx in range(0, k):
            res_list.append(sorted_table[idx][0])
        return res_list