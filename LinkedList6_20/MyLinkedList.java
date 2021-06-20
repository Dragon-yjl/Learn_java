package LinkedList6_20;

//单链表

class Node {

    public int data;//单链表分为两块，上面一块存放的是他的数据
    public Node next;//第二块存放的是下一个节点的地址，引用

    public Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList {

    public Node head;//表示单链表的头结点

    //单链表头插法

    public void addFirst(int data) {
        Node node = new Node(data);

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

    //查找是否包含关键字key 是否在单链表中

    public boolean contains(int key) {

        Node cur = this.head;

        while (cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }


    //只遍历一遍单链表就能吧所有为key的节点删除
    //删除所有值为key的节点

    public void removeAllKey(int key) {


        if(this.head == null)
            return;

        Node prev = this.head;
        Node cur = this.head.next;

        while (cur != null) {
            if(cur.data == key) {
               prev.next = cur.next;
               cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }

        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }
}
