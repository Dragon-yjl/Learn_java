package DoubleLinkedList;

public class TestDemo2 {

    public static void main(String[] args) {

        MyDoubleLinkedList myDoubleLinkedList = new MyDoubleLinkedList();

        myDoubleLinkedList.addFirst(34);
        myDoubleLinkedList.addFirst(664);

        myDoubleLinkedList.display();

        myDoubleLinkedList.addLast(66);
        myDoubleLinkedList.addLast(99);

        myDoubleLinkedList.display();

        System.out.println(myDoubleLinkedList.size());

        System.out.println(myDoubleLinkedList.searchIndex(3).data);

        myDoubleLinkedList.addIndex(2,666);
        myDoubleLinkedList.addIndex(0,666);
        myDoubleLinkedList.addIndex(6,666);

        myDoubleLinkedList.display();

//        myDoubleLinkedList.removeAllKey(99);
//
//        myDoubleLinkedList.display();
//
//        myDoubleLinkedList.removeFirstKey(666);
//
//        myDoubleLinkedList.display();
//
//        myDoubleLinkedList.removeAllKey(666);
//
//        myDoubleLinkedList.display();
//
        myDoubleLinkedList.clear();

        myDoubleLinkedList.display();

        System.out.println("================'");
    }
}
