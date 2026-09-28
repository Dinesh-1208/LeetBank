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
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode mid = getMid(head);

        // Reverse second half
        ListNode second = reverseFrom(mid);

        ListNode first = head;

        while (second != null) {

            if (first.val != second.val) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;
    }

    ListNode getMid(ListNode head) {

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.next;
    }

    ListNode reverseFrom(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {

            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }
}