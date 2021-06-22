package LinkedList6_22;

public class MyLinkedTest {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addFirst(10);
        myLinkedList.addFirst(20);
        myLinkedList.addFirst(30);

        myLinkedList.display();

        System.out.println(myLinkedList.middleNode());
    }




}
