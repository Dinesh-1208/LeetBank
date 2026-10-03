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
    public ListNode swapPairs(ListNode head) {
        ListNode curr = head;
        ListNode last = null;
        while(curr != null) {
            ListNode prev = null;
            ListNode newEnd = curr;
            for(int i = 0;curr != null && i < 2;i++) {
                ListNode nex = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nex;
            }
            if(last == null) {
                head = prev;
            } else {
                last.next = prev;
            }
            newEnd.next = curr;
            last = newEnd;
        }
        return head;
    }
}