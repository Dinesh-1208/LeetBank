class LFUCache {

    class Node {
        int key,val,freq;
        Node next,prev;

        Node(int key,int val) {
            this.key = key;
            this.val = val;
            this.freq = 1;
        }
    }

    class DoublyList {
        Node head,tail;
        int size;

        DoublyList() {
            head = new Node(0,0);
            tail = new Node(0,0);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        void addFirst(Node node) {
            node.next = head.next;
            head.next.prev = node;
            node.prev = head;
            head.next = node;
            size++;
        }
        
        void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

        Node removeLast() {
            if(size == 0) return null;
            Node node = tail.prev;
            remove(node);
            return node;
        }

        boolean isEmpty() {
            return size == 0;
        }
    }

    int capacity;
    int minFreq;
    HashMap<Integer,Node> map;
    HashMap<Integer,DoublyList> freqMap;
    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        map = new HashMap<>();
        freqMap = new HashMap<>();
    }
    
    private void updateFreq(Node node) {
        int oldFreq = node.freq;
        DoublyList oldList = freqMap.get(oldFreq);
        oldList.remove(node);
        if(minFreq == oldFreq && oldList.isEmpty()) {
            minFreq++;
        }
        node.freq++;
        DoublyList newList = freqMap.computeIfAbsent(node.freq,k -> new DoublyList());
        newList.addFirst(node);
    }

    public int get(int key) {
        if(!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);
        updateFreq(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(capacity == 0) return;
        if(map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            updateFreq(node);
            return;
        }
        if(capacity == map.size()) {
            DoublyList list = freqMap.get(minFreq);
            Node lfu = list.removeLast();
            map.remove(lfu.key);
        }
        Node node = new Node(key,value);
        map.put(key,node);
        DoublyList list = freqMap.computeIfAbsent(1,k -> new DoublyList());
        list.addFirst(node);
        minFreq = 1;
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */