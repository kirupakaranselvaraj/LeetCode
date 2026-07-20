// Last updated: 20/07/2026, 15:54:56
1import java.util.HashMap;
2class Solution {
3    public boolean containsNearbyDuplicate(int[] nums, int k) {
4        HashMap<Integer, Integer> map = new HashMap<>();
5        for (int i = 0; i < nums.length; i++) {
6            if (map.containsKey(nums[i])) {
7                if (i - map.get(nums[i]) <= k) {
8                    return true;
9                }
10            }
11            map.put(nums[i], i);
12        }
13        return false;
14    }
15}