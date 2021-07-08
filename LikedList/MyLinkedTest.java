package LikedList;

public class MyLinkedTest {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addFirst(5);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(8);
        myLinkedList.addFirst(8);
        myLinkedList.addFirst(45);

        myLinkedList.display();

        myLinkedList.removeAll();

        myLinkedList.display();
    }
}
