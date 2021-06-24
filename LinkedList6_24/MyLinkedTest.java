package LinkedList6_24;

public class MyLinkedTest {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addFirst(666);
        myLinkedList.addFirst(999);
        myLinkedList.addFirst(888);

        myLinkedList.display();

        System.out.println(myLinkedList.size());

        System.out.println(myLinkedList.middleNode().data);

        myLinkedList.reverseList();

        myLinkedList.display();

        System.out.println(myLinkedList.findKthToTail(2).data);
    }


}
