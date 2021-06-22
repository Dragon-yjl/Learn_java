package LinkedList6_22;


class Node {

    public int data;
    public Node next;


    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList {

    public Node head;//头结点

    public void addFirst(int data) {

        Node node = new Node(data);
        if(this.head == null) {

            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }

    public void display () {
        Node cur = this.head;

        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public int middleNode() {

        Node slow = this.head;
        Node fast = this.head.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.data;
    }

//    public void reverseList () {
//
//        Node cur = this.head;
//        Node prev = null;
//        Node newHead = null;
//
//
//    }
}
