package LinkedList622;

import LinkedList6_22.MyLinkedList;

public class MyLinkedTest1 {

    public static void main(String[] args) {

        MyLinkedList1 myLinkedList1 = new MyLinkedList1();

        myLinkedList1.addFirst(123);
        myLinkedList1.addFirst(555);
        myLinkedList1.addFirst(231);
        myLinkedList1.addFirst(666);
        myLinkedList1.addFirst(222);

        myLinkedList1.display();

        System.out.println(myLinkedList1.middleNode());

        myLinkedList1.reverseList();

        myLinkedList1.display();

        System.out.println(myLinkedList1.findKthToTail(1).data);

        myLinkedList1.partition(222);

        myLinkedList1.display();
    }
}
