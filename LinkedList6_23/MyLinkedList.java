package LinkedList6_23;


import java.util.jar.Manifest;

//单链表
class Node {

    public int data;//第一款存放的是单链表的数据
    public Node next;//第二块存放的是单链表的下一个节点的引用

    public Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList {

    public Node head;//单链表的头结点

    /**
     * 头插法
     * @param data 给一个数据，如果链表为空，直接插入，
     *             如果不为空，先把头结点付给这个数据的下一个节点，然后再把这个数据作为头结点
     */
    public void addFirst(int data) {

        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }


    /**
     * 打印单链表
     * 定义一个cur，当cur不为空，打印cur.data ， cur往下走，当cur为空，停止打印
     */

    public void display() {
        Node cur = this.head;

        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    /**
     * 求单链表长度
     * @return 定义一个计数器，cur往下走，不为空++，为空之后返回计数器
     */
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count ++;
            cur = cur.next;
        }

        return count;
    }

    /**
     * 求链表最中间节点的数据
     * 定义连个快慢指针 让快的一次走两步，慢的一次走一步，快的走到最后一个节点，慢的就在最中间位置
     * @return 返回最中间位置的节点的数据
     */
    public int middleNode () {
        Node slow = this.head;
        Node fast = this.head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.data;
    }


    public Node reverseList() {
        Node cur = this.head;
        Node prev = null;
        Node newHead = null;

        while (cur != null) {
            Node curNext =  cur.next;
            if(curNext == null); {
                newHead = cur;
            }
                cur.next = prev;
                prev = cur;
                cur = curNext;

        }
        return this.head = newHead;
    }
}
