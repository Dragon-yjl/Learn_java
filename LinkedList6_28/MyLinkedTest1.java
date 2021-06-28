package LinkedList6_28;

import Linked6_28.MyLinkedList;

public class MyLinkedTest1 {

    public static void main(String[] args) {

        MyLinkedList1 myLinkedList1 = new MyLinkedList1();

        myLinkedList1.addFirst(666);
        myLinkedList1.addFirst(999);
        myLinkedList1.addFirst(777);
        myLinkedList1.addFirst(666);

        myLinkedList1.display();

        System.out.println(myLinkedList1.chkPalindrome());

        System.out.println(myLinkedList1.hasCycle());

        System.out.println(myLinkedList1.detectCycle().data);


    }
}
