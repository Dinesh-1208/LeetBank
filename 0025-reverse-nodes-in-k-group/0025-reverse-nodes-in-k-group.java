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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null) {
            return head;
        }
        ListNode curr = head;
        ListNode last = null;
        while(curr != null) {
            ListNode check = curr;
            for(int i = 0;i < k;i++) {
                if(check == null) {
                    return head;
                }
                check = check.next;
            }
            ListNode prev = null;
            ListNode newEnd = curr;
            for(int i = 0;i < k;i++) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            if(last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = curr;
            last = newEnd;
        }
        return head;
    }
}