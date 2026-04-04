class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        a = {}
        for num in nums:
            a[num] = a.get(num, 0) + 1
        
        res = sorted(a.keys(), key=lambda x: a[x], reverse=True)
        return res[:k]