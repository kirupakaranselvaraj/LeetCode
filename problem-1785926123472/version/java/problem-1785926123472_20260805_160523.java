// Last updated: 05/08/2026, 16:05:23
1import java.util.HashSet;
2class Solution {
3    public boolean containsDuplicate(int[] nums) {
4        HashSet<Integer> set = new HashSet<>();
5        for (int num : nums) {
6            if (set.contains(num)) {
7                return true;
8            }
9            set.add(num);
10        }
11        return false;
12    }
13}