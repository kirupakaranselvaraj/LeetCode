// Last updated: 13/07/2026, 15:59:38
1class Solution {
2    public boolean isPalindrome(ListNode head) {
3        ListNode slow = head;
4        ListNode fast = head;
5        while (fast != null && fast.next != null) {
6            slow = slow.next;
7            fast = fast.next.next;
8        }
9        ListNode prev = null;
10        ListNode curr = slow;
11        while (curr != null) {
12            ListNode next = curr.next;
13            curr.next = prev;
14            prev = curr;
15            curr = next;
16        }
17        ListNode first = head;
18        ListNode second = prev;
19        while (second != null) {
20            if (first.val != second.val) {
21                return false;
22            }
23            first = first.next;
24            second = second.next;
25        }
26        return true;
27    }
28}