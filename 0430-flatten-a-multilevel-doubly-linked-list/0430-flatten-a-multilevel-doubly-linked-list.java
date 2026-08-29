/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {

        Node curr = head;

        while (curr != null) {

            if (curr.child != null) {

                // Save the original next node
                Node next = curr.next;

                // Flatten the child list
                Node childHead = flatten(curr.child);

                // Connect curr -> child
                curr.next = childHead;
                childHead.prev = curr;

                // Find the end of the child list
                Node tail = childHead;

                while (tail.next != null) {
                    tail = tail.next;
                }

                // Connect child list -> original next
                tail.next = next;

                if (next != null) {
                    next.prev = tail;
                }

                // Remove child pointer
                curr.child = null;
            }

            curr = curr.next;
        }

        return head;
    }
}