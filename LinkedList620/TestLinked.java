package LinkedList620;

public class TestLinked {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(10);
        linkedList.addFirst(9);
        linkedList.addFirst(8);
        linkedList.addFirst(7);
        linkedList.addFirst(6);

        linkedList.display();

        Node newHead = linkedList.reverseList();

        linkedList.display1(newHead);

        System.out.println(linkedList.middleNode().data);


    }


}
