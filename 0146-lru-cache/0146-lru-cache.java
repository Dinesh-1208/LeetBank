class LRUCache {
    class Node {
        int key,val;
        Node prev,next;
        Node(int key,int val) {
            this.key = key;
            this.val = val;
        }
    }
    int capacity;
    HashMap<Integer,Node> map;
    Node head,tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    private void insertAtFirst(Node node) {
        head.next.prev = node;
        node.next = head.next;
        node.prev = head;
        head.next = node;
    }
    public int get(int key) {
        if(!map.containsKey(key)) {
            return -1;
        }
        Node cur = map.get(key);
        remove(cur);
        insertAtFirst(cur);
        return cur.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            insertAtFirst(node);
            node.val = value;
        } else {
            if(map.size() == capacity) {
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node node = new Node(key,value);
            insertAtFirst(node);
            map.put(key,node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */