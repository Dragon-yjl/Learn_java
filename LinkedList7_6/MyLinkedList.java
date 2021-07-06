package LinkedList7_6;

class Node {
    public int data;
    public Node next;
}
public class MyLinkedList {

    public  Node reverse(Node head) {

        if(head == null) {
            return null;
        }

        Node newHead = null;
        Node cur = head;
        Node prev = null;

        while (cur != null) {
            if(cur.next == null) {
                newHead = cur;
            }
            Node curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }

        return newHead;
        //或return prev;
    }
}
