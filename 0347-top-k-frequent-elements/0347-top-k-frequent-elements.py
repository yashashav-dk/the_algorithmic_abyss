class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        htable = {}
        for num in nums:
            htable[num] = htable.get(num, 0) + 1

        # buckets = []
        # for _ in range(len(nums) + 1):
        #     buckets.append([])

        buckets = [ [] for _ in range(len(nums) + 1) ]

        # print(buckets)

        for num, freq in htable.items():
            buckets[freq].append(num)
        res = []
        for idx in range(len(buckets) - 1, -1, -1):
            ele_list = buckets[idx]

            for ele in ele_list:
                if k > 0:
                    res.append(ele)
                    k -= 1
        return res

