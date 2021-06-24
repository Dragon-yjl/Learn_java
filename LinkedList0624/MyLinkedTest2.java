package LinkedList0624;

public class MyLinkedTest2 {

    public static void main(String[] args) {

        MyLinkedList2 myLinkedList2 = new MyLinkedList2();

        myLinkedList2.addFirst(12);
        myLinkedList2.addFirst(123);
        myLinkedList2.addFirst(123);
        myLinkedList2.addFirst(12);

        myLinkedList2.display();

//        System.out.println(myLinkedList2.middleNode().data);

//        System.out.println(myLinkedList2.chkPalindrome());

//        System.out.println(myLinkedList2.hasCycle());

        System.out.println(myLinkedList2.detectCycle());
    }
}
