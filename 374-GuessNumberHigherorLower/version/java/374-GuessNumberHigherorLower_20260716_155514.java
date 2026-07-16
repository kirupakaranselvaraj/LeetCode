// Last updated: 16/07/2026, 15:55:14
1public class Solution extends GuessGame {
2    public int guessNumber(int n) {
3        int left = 1;
4        int right = n;
5        while (left <= right) {
6            int mid = left + (right - left) / 2;
7            int result = guess(mid);
8            if (result == 0) {
9                return mid;
10            }
11            if (result == 1) {
12                left = mid + 1;
13            } else {
14                right = mid - 1;
15            }
16        }
17        return -1;
18    }
19}