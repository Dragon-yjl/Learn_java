package LinkedList620;


class Node {

    public int data;//单链表分为两块，上面一块存放的是他的数据
    public Node next;//第二块存放的是下一个节点的地址，引用

    public Node(int data) {
        this.data = data;
    }
}

public class LinkedList {

    public Node head;//表示单链表的头结点



    //单链表头插法

    public void addFirst(int data) {
        Node node = new  Node(data);

        if(this.head == null) {
            this.head = node;
        }else {

            node.next = this.head;
            this.head = node;
        }

        //或者不用if else 直接写
        //node.next = this.head;//如果单链表为空的话这句话可以没有
        //this.head = node;
    }

    //打印单链表

    public void display() {

        Node cur = this.head;
        while (cur != null) {//如果是cur.next!=null 单链表中如果只有一个数据就不能打印了
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }


    //只遍历一遍单链表，把单链表翻转

    public Node reverseList() {

        Node cur = this.head;//cur表示当前需要反转的节点
        Node prev = null;//前驱
        Node newHead = null;//新的链表的头结点

        while ( cur != null) {
            Node curNext = cur.next;//先把cur.next的引用保存到curNext当中
            if(curNext == null) {
                newHead = cur;

            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }

       //this.head = null;//可有可无
        return newHead;
    }


    //打印反转之后的单链表



    public void display1(Node newHead) {

        Node cur = newHead;
        while (cur != null) {//如果是cur.next!=null 单链表中如果只有一个数据就不能打印了
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }


    //打印单链表最中间的data
    //定义一个slow 一个fast，让slow一次走一步，fast一次走两步
    //放fast走到最后的时候slow就在最中间位置

    public Node middleNode() {
        Node slow = this.head;
        Node fast = this.head.next;

        while(fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;
    }
}
