class MyLinkedList {

    class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {

        if (index < 0 || index >= size) {
            return -1;
        }

        Node curr;

        // Start from whichever side is closer
        if (index < size / 2) {
            curr = head;

            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }

        } else {
            curr = tail;

            for (int i = size - 1; i > index; i--) {
                curr = curr.prev;
            }
        }

        return curr.val;
    }

    public void addAtHead(int val) {

        Node newNode = new Node(val);

        if (size == 0) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    public void addAtTail(int val) {

        Node newNode = new Node(val);

        if (size == 0) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node curr;

        // Find the node currently at index
        if (index < size / 2) {
            curr = head;

            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }

        } else {
            curr = tail;

            for (int i = size - 1; i > index; i--) {
                curr = curr.prev;
            }
        }

        Node newNode = new Node(val);

        newNode.prev = curr.prev;
        newNode.next = curr;

        curr.prev.next = newNode;
        curr.prev = newNode;

        size++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) {
            return;
        }

        if (index == 0) {

            if (size == 1) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }

            size--;
            return;
        }

        if (index == size - 1) {

            tail = tail.prev;
            tail.next = null;

            size--;
            return;
        }

        Node curr;

        if (index < size / 2) {
            curr = head;

            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }

        } else {
            curr = tail;

            for (int i = size - 1; i > index; i--) {
                curr = curr.prev;
            }
        }

        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;

        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */