package LinkedList6_27;

public class MyLinkedTest {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addFirst(5);
        myLinkedList.addFirst(53);
        myLinkedList.addFirst(6);
        myLinkedList.addFirst(34);
        myLinkedList.addFirst(98);

        myLinkedList.display();

        System.out.println(myLinkedList.middleNode().data);

        System.out.println(myLinkedList.size());

        myLinkedList.reverseList();

        myLinkedList.display();
    }
}
