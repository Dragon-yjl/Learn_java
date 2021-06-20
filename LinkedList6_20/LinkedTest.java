package LinkedList6_20;

//测试单链表

public class LinkedTest {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addFirst(9);
        myLinkedList.addFirst(9);
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(8);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(9);
        myLinkedList.addFirst(9);

        myLinkedList.display();

        myLinkedList.removeAllKey(9);

        myLinkedList.display();


        System.out.println(myLinkedList.contains(9));
    }
}
