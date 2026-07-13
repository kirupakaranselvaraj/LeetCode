// Last updated: 13/07/2026, 15:56:40
1class Solution {
2    public ListNode middleNode(ListNode head) {
3        ListNode slow = head;
4        ListNode fast = head;
5        while (fast != null && fast.next != null) {
6            slow = slow.next;
7            fast = fast.next.next;
8        }
9        return slow;
10    }
11}