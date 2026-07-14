// Last updated: 14/07/2026, 17:50:40
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        for (long i = 1; i * i <= num; i++) {
4            if (i * i == num) {
5                return true;
6            }
7        }
8        return false;
9    }
10}