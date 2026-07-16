// Last updated: 16/07/2026, 16:02:10
1import java.util.HashSet;
2class Solution {
3    public boolean isHappy(int n) {
4        HashSet<Integer> set = new HashSet<>();
5        while (n != 1 && !set.contains(n)) {
6            set.add(n);
7            int sum = 0;
8            while (n > 0) {
9                int digit = n % 10;
10                sum += digit * digit;
11                n = n / 10;
12            }
13            n = sum;
14        }
15        return n == 1;
16    }
17}