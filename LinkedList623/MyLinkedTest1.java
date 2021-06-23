package LinkedList623;

public class MyLinkedTest1 {
    public static void main(String[] args) {

        MyLinkedList1 myLinkedList1 = new MyLinkedList1();

        myLinkedList1.addFirst(1);
        myLinkedList1.addFirst(1);
        myLinkedList1.addFirst(2);
        myLinkedList1.addFirst(2);
        myLinkedList1.addFirst(2);
        myLinkedList1.addFirst(9);

        myLinkedList1.display();

        System.out.println(myLinkedList1.findKthToTail(2).data);//2
        System.out.println(myLinkedList1.findKthToTail(4).data);//5

        myLinkedList1.partition(3);

        myLinkedList1.display();

        myLinkedList1.removeSameData();

        myLinkedList1.display();

    }
}
