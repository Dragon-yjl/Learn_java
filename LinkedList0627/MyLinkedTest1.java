package LinkedList0627;



public class MyLinkedTest1 {

    public static void main(String[] args) {

        MyLinkedList1 myLinkedList1 = new MyLinkedList1();

        myLinkedList1.addFirst(2);
        myLinkedList1.addFirst(5);
        myLinkedList1.addFirst(3);
        myLinkedList1.addFirst(8);
        myLinkedList1.addFirst(9);
        myLinkedList1.addFirst(1);

        myLinkedList1.display();

        System.out.println(myLinkedList1.findKthToTail(2).data);

        myLinkedList1.partition(4);

        myLinkedList1.display();


    }
}
