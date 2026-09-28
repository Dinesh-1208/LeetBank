
public class Solution {
     class ListNode {
        @SuppressWarnings("unused")
        int val;
        ListNode next;
        @SuppressWarnings("unused")
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
     @SuppressWarnings("unused")
    private boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}