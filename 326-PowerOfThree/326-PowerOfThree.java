// Last updated: 09/07/2026, 09:11:05
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        return 1162261467 % n == 0;
    }
}
