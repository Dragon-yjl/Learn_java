package LinkedList6_22;

public class MyLinkedTest {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addFirst(10);
        myLinkedList.addFirst(20);
        myLinkedList.addFirst(30);

        myLinkedList.display();

        System.out.println(myLinkedList.middleNode());

        myLinkedList.reverseList();

        myLinkedList.display();

        //System.out.println(myLinkedList.findKthToTail(0).data);
        System.out.println(myLinkedList.findKthToTail(1).data);
        System.out.println(myLinkedList.findKthToTail(2).data);
        System.out.println(myLinkedList.findKthToTail(3).data);
    }




}
