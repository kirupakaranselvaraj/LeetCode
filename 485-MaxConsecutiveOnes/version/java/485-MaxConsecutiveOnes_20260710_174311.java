// Last updated: 10/07/2026, 17:43:11
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int count = 0;
4        int max = 0;
5        for (int num : nums) {
6            if (num == 1) {
7                count++;
8                max = Math.max(max, count);
9            } else {
10                count = 0;
11            }
12        }
13        return max;
14    }
15}