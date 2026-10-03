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
    public ListNode partition(ListNode head, int x) {
        ListNode dummyA = new ListNode(0);
        ListNode dummyB = new ListNode(0);
        ListNode curr = head;
        ListNode a = dummyA;
        ListNode b = dummyB;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = null;
            if(curr.val < x) {
                a.next = curr;
                a = a.next;
            } else {
                b.next = curr;
                b = b.next;
            }
            curr = next;
        }
        a.next = dummyB.next;
        return dummyA.next;
    }
}