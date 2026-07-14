// Last updated: 14/07/2026, 17:52:39
1class Solution {
2    public char findTheDifference(String s, String t) {
3        int sumS = 0;
4        int sumT = 0;
5        for (char ch : s.toCharArray()) {
6            sumS += ch;
7        }
8        for (char ch : t.toCharArray()) {
9            sumT += ch;
10        }
11        return (char) (sumT - sumS);
12    }
13}