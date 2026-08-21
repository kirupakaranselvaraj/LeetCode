// Last updated: 21/08/2026, 16:22:56
class Solution {
    public int[] countBits(int n) {
        int[] answer = new int[n + 1];
        answer[0] = 0;
        for (int i = 1; i <= n; i++) {
            answer[i] = answer[i >> 1] + (i & 1);
        }
        return answer;
    }
}