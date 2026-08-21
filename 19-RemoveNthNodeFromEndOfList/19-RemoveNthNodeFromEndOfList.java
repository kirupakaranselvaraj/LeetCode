// Last updated: 21/08/2026, 16:25:14
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        temp = dummy;

        for (int i = 0; i < length - n; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return dummy.next;
    }
}