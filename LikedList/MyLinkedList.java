package LikedList;


import jdk.nashorn.internal.ir.BaseNode;

class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

}


public class MyLinkedList {

    public Node head;

    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }


    public void display() {
        Node cur = this.head;

        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public Node  removeAll() {
        Node newHead = new Node(-1);
        Node tmp = newHead;

        Node cur = this.head;

        while (cur != null && cur.next != null) {
            if ( cur.next != null && cur.data == cur.next.data) {

              while (cur.next != null && cur.data == cur.next.data) {
                  cur = cur.next;
              }

              cur = cur.next;
            }else {
               tmp.next = cur;
               tmp = cur;
               cur = cur.next;
            }

        }

        tmp.next = null;
        return this.head = newHead.next;
    }
}
