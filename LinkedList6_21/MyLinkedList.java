package LinkedList6_21;

/**
 *单链表
 * 不带头单向非循环链表
 */

class Node {

    public int data;//单链表分为两部分，上面一部分存放的就是他的数据
    public Node next;//下面一部分存放的是它的下一个节点的地址，就是引用

    //构造方法
    public Node(int data) {
        this.data = data;
    }
}


public class MyLinkedList {

    public Node head;//定义它的头结点


    /**
     * 头插法
     * @param data 把这个数据插入到单链表头部
     *             1.判断单链表是否为空，为空的话直接插入
     *             2.不为空的话，吧头结点引用赋给插入数据的下面的引用，在吧新插入的数据作为头部
     */

    public void addFirst (int data) {

        Node node = new Node(data);//新给的数据作为一个节点

        if(this.head == null) {//单链表为空
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }

        //也可以不用if else、直接两句代码搞定
        //node.next = this.head;//单链表为空的话这句话不执行
        //this.head = node;
    }

    /**
     * 打印单链表
     */

    public void display() {

        Node cur = this.head;//定义一个节点从头开始
        while (cur != null) {//为空说明到了最后一个节点，如果为cur.next !=null最后一个数据就不能打印了
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }


    /**
     * 打印最中间的节点的数据
     * @return  最中间节点的data
     *
     */
    public int middleNode() {

        Node slow = this.head;//定义一个slow从头结点开始走
        Node fast = this.head.next;//定义一个fast从头结点的下一个位置开始走

        while (fast != null && fast.next != null ) {//当这两个为空说明fast走到了最后，此时slow就在最中间
            fast = fast.next.next;//fast先走 一次走两步
            slow = slow.next;//slow一次走一步
        }
        return slow.data;
    }


    /**
     * 之遍历一遍单链表把它翻转过来
     * @return 返回新的链表的头结点
     * */

    public Node reverseList() {

        Node cur = this.head;
        Node prev = null;
        Node newHead = null;

        while (cur != null) {
            Node curNext = cur.next;
            if(curNext == null){
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;

        }
        return this.head = newHead;
    }
}
