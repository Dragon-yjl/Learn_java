package Linked6_29;

class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

}

public class MyLinkedList1 {

    public Node head;

    public void addFirst (int data) {

        Node node = new Node(data);

        if (this.head != null) {
            node.next = this.head;
        }
        this.head = node;
    }

    public void display () {

        Node cur = this.head;

        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public int size() {

        int count = 0;
        Node cur = this.head;

        while (cur != null) {
            count ++;
            cur = cur.next;
        }

        return count;
    }
}
