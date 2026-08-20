// Last updated: 20/08/2026, 14:57:03
1class Solution {
2    public ListNode getIntersectionNode(ListNode a, ListNode b) {
3        ListNode x = a, y = b;
4        while (x != y) {
5            x = x == null ? b : x.next;
6            y = y == null ? a : y.next;
7        }
8        return x;
9    }
10}