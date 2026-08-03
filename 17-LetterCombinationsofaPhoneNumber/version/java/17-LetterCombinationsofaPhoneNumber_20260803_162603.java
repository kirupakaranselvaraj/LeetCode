// Last updated: 03/08/2026, 16:26:03
1class Solution {
2    public List<String> letterCombinations(String digits) {
3        List<String> result = new ArrayList<>();
4
5        if (digits.length() == 0) {
6            return result;
7        }
8
9        String[] map = {
10            "", "", "abc", "def",
11            "ghi", "jkl", "mno",
12            "pqrs", "tuv", "wxyz"
13        };
14
15        backtrack(digits, 0, new StringBuilder(), result, map);
16
17        return result;
18    }
19
20    void backtrack(String digits, int index, StringBuilder current,
21                   List<String> result, String[] map) {
22
23        if (index == digits.length()) {
24            result.add(current.toString());
25            return;
26        }
27
28        String letters = map[digits.charAt(index) - '0'];
29
30        for (char ch : letters.toCharArray()) {
31            current.append(ch);
32            backtrack(digits, index + 1, current, result, map);
33            current.deleteCharAt(current.length() - 1);
34        }
35    }
36}