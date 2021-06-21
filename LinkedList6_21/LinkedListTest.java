package LinkedList6_21;

import ArrayList6_21.MyArrayList;

public class LinkedListTest {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.display();

        myLinkedList.addFirst(111);
        myLinkedList.addFirst(222);
        myLinkedList.addFirst(333);
        myLinkedList.addFirst(444);
        myLinkedList.addFirst(555);
        myLinkedList.addFirst(666);

        myLinkedList.display();

        System.out.println(myLinkedList.middleNode());//444

        myLinkedList.reverseList();

        myLinkedList.display();
    }
}
