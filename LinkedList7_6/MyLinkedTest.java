package LinkedList7_6;

public class MyLinkedTest {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        Node head = new Node();
        head.data = 1;

        head.next = new Node();
        head.next.data = 2;

        head.next.next = new Node();
        head.next.next.data= 3;

        head.next.next.next = new Node();
        head.next.next.next.data= 4;

        Node cur = myLinkedList.reverse(head);

        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;

        }
        System.out.println();
    }
}
