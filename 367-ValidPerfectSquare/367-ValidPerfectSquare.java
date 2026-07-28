// Last updated: 28/07/2026, 14:41:13
class Solution {
    public boolean isPerfectSquare(int num) {
        for (long i = 1; i * i <= num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
}