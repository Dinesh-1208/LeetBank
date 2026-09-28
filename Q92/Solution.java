class Solution {

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        ListNode curr = head;
        ListNode prev = null;
        for(int i = 0;curr != null && i < left - 1;i++) {
            prev = curr;
            curr = curr.next;
        }
        ListNode last = prev;
        ListNode newEnd = curr;
        for(int i = 0;curr != null && i < right - left + 1;i++) {
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
        if(newEnd != null) {
            newEnd.next = curr;
        }
        return head;
    }
}