package LinkedList619;

//测试单链表

public class LinkedTest {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        //头插法测试
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);

        myLinkedList.display();//3 2 1
        //先把1插进去，然后把2头插法插到第一个，最后把3插到第一个

        //尾插法测试
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);

        myLinkedList.display();

        myLinkedList.addIndex(2,10);
        myLinkedList.addIndex(4,20);
        myLinkedList.addIndex(6,30);

        myLinkedList.display();

        //删除测试
        myLinkedList.remove(30);
        myLinkedList.remove(20);

        myLinkedList.display();

        myLinkedList.remove(2);
        myLinkedList.remove(10);
        myLinkedList.remove(1);
        myLinkedList.remove(3);
        myLinkedList.remove(1);
        myLinkedList.remove(2);
        myLinkedList.display();

        myLinkedList.remove(3);

        System.out.println("==============");
        myLinkedList.display();
    }
}
