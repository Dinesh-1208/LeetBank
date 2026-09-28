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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode pres = head;
        ListNode prev = null;
        while(pres.next != null) {
            ListNode fut = pres.next;
            pres.next = prev;
            prev = pres;
            pres = fut;
        }
        pres.next = prev;
        return pres;
    }
}