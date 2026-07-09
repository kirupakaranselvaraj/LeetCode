# Last updated: 09/07/2026, 09:12:46
class Solution:
    def twoSum(self, nums, target):
        num_map = {}  # num: index

        for i, num in enumerate(nums):
            complement = target - num
            if complement in num_map:
                return [num_map[complement], i]
            num_map[num] = i
