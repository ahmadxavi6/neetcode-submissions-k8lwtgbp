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
    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(head != null){
            res.add(head.val);
            head = head.next;
        }
        for(int i = res.size()-1 ; i>=0 ; i--){
            current.next = new ListNode(res.get(i));
            current = current.next;
        }
        return dummy.next;

    }
}
