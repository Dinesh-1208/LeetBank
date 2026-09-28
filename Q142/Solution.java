
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
    private ListNode detectCycle(ListNode head) {
        int l = findLength(head);
        ListNode s = head;
        ListNode f = head;
        if(l == 0) return null;
        while(l != 0) {
            s = s.next;
            l--;
        }
        while(f != s) {
            f = f.next;
            s = s.next;
        }
        return f;
    }
    private int findLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                int c = 1;
                slow = slow.next;
                while(slow != fast) {
                    c++;
                    slow = slow.next;
                }
                return c;
            }
        }
        return 0;
    }
}