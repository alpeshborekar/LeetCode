
class LRUCache {

    class DLLNode {
        DLLNode next;
        DLLNode prev;
        int key;
        int value;

        DLLNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private DLLNode head;
    private DLLNode tail;
    private int size;
    private int capacity;
    private Map<Integer, DLLNode> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.map = new HashMap<>();

        head = new DLLNode(-1, -1);
        tail = new DLLNode(-1, -1);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DLLNode node = findkey(key);

        if (node == null) {
            return -1;
        }

        moveNodetoEnd(node);
        return node.value;
    }

    private DLLNode findkey(int key) {
        return map.get(key);
    }

    private void moveNodetoEnd(DLLNode node) {
        // Remove node from its current position
        node.prev.next = node.next;
        node.next.prev = node.prev;

        // Insert node just before tail
        node.prev = tail.prev;
        node.next = tail;

        tail.prev.next = node;
        tail.prev = node;
    }

    public void put(int key, int value) {
        DLLNode node = findkey(key);

        // Key already exists
        if (node != null) {
            node.value = value;
            moveNodetoEnd(node);
            return;
        }

        // Cache is full: remove least recently used node
        if (size == capacity) {
            DLLNode lru = head.next;

            head.next = lru.next;
            lru.next.prev = head;

            map.remove(lru.key);
            size--;
        }

        // Insert new node before tail
        DLLNode newNode = new DLLNode(key, value);

        newNode.prev = tail.prev;
        newNode.next = tail;

        tail.prev.next = newNode;
        tail.prev = newNode;

        map.put(key, newNode);
        size++;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */