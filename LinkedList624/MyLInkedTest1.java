package LinkedList624;

public class MyLInkedTest1 {

    public static void main(String[] args) {

        MyLinkedList1 myLinkedList1 = new MyLinkedList1();

        myLinkedList1.addFirst(5);
        myLinkedList1.addFirst(5);
        myLinkedList1.addFirst(8);
        myLinkedList1.addFirst(8);
        myLinkedList1.addFirst(9);
        myLinkedList1.addFirst(1);
        myLinkedList1.addFirst(1);

        myLinkedList1.display();

        myLinkedList1.partition(6);

        myLinkedList1.display();

        myLinkedList1.removeSameData();

        myLinkedList1.display();
    }
}
