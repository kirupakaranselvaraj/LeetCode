// Last updated: 28/07/2026, 14:48:35
1class Solution {
2    public int[] countBits(int n) {
3        int[] answer = new int[n + 1];
4        answer[0] = 0;
5        for (int i = 1; i <= n; i++) {
6            answer[i] = answer[i >> 1] + (i & 1);
7        }
8        return answer;
9    }
10}