// Last updated: 14/07/2026, 17:46:24
1class Solution {
2    public ListNode removeElements(ListNode head, int val) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5        ListNode current = dummy;
6        while (current.next != null) {
7            if (current.next.val == val) {
8                current.next = current.next.next;
9            } else {
10                current = current.next;
11            }
12        }
13        return dummy.next;
14    }
15}