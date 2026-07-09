# Last updated: 09/07/2026, 09:10:42
class Solution(object):
    def shuffle(self, nums, n):
        result = []
        for i in range(n):
            result.append(nums[i])
            result.append(nums[i + n])
        return result
