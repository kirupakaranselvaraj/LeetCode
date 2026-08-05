// Last updated: 05/08/2026, 16:06:27
1class Solution {
2    public ListNode removeNthFromEnd(ListNode head, int n) {
3
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6
7        int length = 0;
8        ListNode temp = head;
9
10        while (temp != null) {
11            length++;
12            temp = temp.next;
13        }
14
15        temp = dummy;
16
17        for (int i = 0; i < length - n; i++) {
18            temp = temp.next;
19        }
20
21        temp.next = temp.next.next;
22
23        return dummy.next;
24    }
25}