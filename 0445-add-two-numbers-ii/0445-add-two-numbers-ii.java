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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = reverse(l1);
        ListNode h2 = reverse(l2);
        return reverse(addNumbers(h1,h2));
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode addNumbers(ListNode l1, ListNode l2) {
        ListNode curr1= l1;
        ListNode curr2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int car = 0;
        while(curr1 != null && curr2 != null) {
            int n1 = curr1.val;
            int n2 = curr2.val;
            int sum = n1 + n2 + car;
            car = sum /10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        while(curr1 != null) {
            int sum = car + curr1.val;
            car = sum /10;
            curr.next = new ListNode(sum % 10);
            curr1 = curr1.next;
            curr = curr.next;
        }
        while(curr2 != null) {
            int sum = car + curr2.val;
            car = sum /10;
            curr.next = new ListNode(sum % 10);
            curr2 = curr2.next;
            curr = curr.next;
        }
        if(car == 1) {
            curr.next = new ListNode(1);
        }
        return dummy.next;
    }
}