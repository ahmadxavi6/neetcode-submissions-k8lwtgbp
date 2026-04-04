/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         // First, calculate the length of the list
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // If we need to remove the head
        if (n == length) {
            return head.next;
        }
              temp = head;
        for (int i = 1; i < length - n; i++) {
            temp = temp.next;
        }

        // Remove the nth node from end
        temp.next = temp.next.next;

        return head;
    }
}
