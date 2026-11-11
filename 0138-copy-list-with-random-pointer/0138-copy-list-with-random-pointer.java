/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node curr = head;
        while(curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }
        curr = head;
        while(curr != null) {
            Node copy = curr.next;
            if(curr.random != null) {
                copy.random = curr.random.next;
            }
            curr = copy.next;
        }
        Node dummy = new Node(0);
        Node temp = dummy;
        curr = head;
        while(curr != null) {
            Node copy = curr.next;
            curr.next = copy.next;
            temp.next = copy;
            temp = temp.next;
            curr = curr.next;
        }
        return dummy.next;
    }
}