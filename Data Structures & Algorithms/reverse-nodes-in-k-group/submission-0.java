class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Count length
        ListNode curr = head;
        int length = 0;
        while (curr != null) {
            curr = curr.next;
            length++;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;

        while (length >= k) {
            ListNode prev = null;
            curr = prevGroupEnd.next;
            ListNode groupStart = curr;

            // Reverse k nodes
            for (int i = 0; i < k; i++) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // Connect with previous part
            prevGroupEnd.next = prev;
            groupStart.next = curr;

            // Move to next group
            prevGroupEnd = groupStart;
            length -= k;
        }

        return dummy.next;
    }
}