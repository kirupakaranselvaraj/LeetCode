// Last updated: 16/07/2026, 16:10:13
1class Solution {
2    public int fib(int n) {
3        if (n <= 1) {
4            return n;
5        }
6        int first = 0;
7        int second = 1;
8        for (int i = 2; i <= n; i++) {
9            int third = first + second;
10            first = second;
11            second = third;
12        }
13        return second;
14    }
15}