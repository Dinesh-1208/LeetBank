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
    public int[] nextLargerNodes(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while(temp != null) {
            n++;
            temp = temp.next;
        }
        int[] arr = new int[n];
        int[] ans = new int[n];
        Arrays.fill(ans,0);
        temp = head;
        for(int i = 0;i < n;i++) {
            arr[i] = temp.val;
            temp = temp.next;
        }
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i < n;i++) {
            while(!st.isEmpty() && arr[i] > arr[st.peek()]) {
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        return ans;
    }
}