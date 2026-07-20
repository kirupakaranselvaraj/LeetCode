// Last updated: 20/07/2026, 15:53:15
1public class Solution {
2    public int hammingWeight(int n) {
3        int count = 0;
4        for (int i = 0; i < 32; i++) {
5            if ((n & 1) == 1) {
6                count++;
7            }
8            n >>>= 1;
9        }
10        return count;
11    }
12}