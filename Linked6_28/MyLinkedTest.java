package Linked6_28;

public class MyLinkedTest {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addFirst(2);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(9);
        myLinkedList.addFirst(9);
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(6);
        myLinkedList.addFirst(6);


        myLinkedList.display();

        System.out.println(myLinkedList.size());

        System.out.println(myLinkedList.middleNode().data);

        myLinkedList.partition(5);

        myLinkedList.display();

        myLinkedList.removeSameData();

        myLinkedList.display();
    }
}
