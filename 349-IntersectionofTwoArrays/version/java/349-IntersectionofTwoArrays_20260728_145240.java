// Last updated: 28/07/2026, 14:52:40
1import java.util.HashSet;
2class Solution {
3    public int[] intersection(int[] nums1, int[] nums2) {
4        HashSet<Integer> set1 = new HashSet<>();
5        HashSet<Integer> result = new HashSet<>();
6        for (int num : nums1) {
7            set1.add(num);
8        }
9        for (int num : nums2) {
10            if (set1.contains(num)) {
11                result.add(num);
12            }
13        }
14        int[] answer = new int[result.size()];
15        int index = 0;
16        for (int num : result) {
17            answer[index++] = num;
18        }
19        return answer;
20    }
21}