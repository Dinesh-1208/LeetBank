class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) {
            return head;
        }
        int n = 1;
        ListNode cur = head;
        while(cur.next != null) {
            cur = cur.next;
            n++;
        }
        cur.next = head;
        k = k % n;
        cur = head;
        ListNode prev = null;
        for(int i = 0;i < (n-k);i++) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;
        return cur;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}