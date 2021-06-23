package LinkedList6_23;

public class MyLinkedTest {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addFirst(666);
        myLinkedList.addFirst(333);
        myLinkedList.addFirst(555);

        myLinkedList.display();//555 333 666

        System.out.println(myLinkedList.size());//3

        System.out.println(myLinkedList.middleNode());//333

        myLinkedList.reverseList();

        myLinkedList.display();//666 333 555

    }
}
