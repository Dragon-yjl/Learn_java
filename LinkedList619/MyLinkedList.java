package LinkedList619;


/**
 * 单向不带头非循环链表
 * 链表由一个一个节点组成，节点用来保存数据
 * data:数据，不一定是整型的
 * next：下一个节点的引用（地址）
 *
 *单链表的最后一个节点的，next域是null
 */

class Node {
    public int data;
    public Node next;//默认null

    public Node(int data) {
        this.data = data;
    }
}



public class MyLinkedList {

    public Node head;//标识单链表的头结点

    //public int usedSize;//可有可无

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);

        if(this.head == null) {//空链表
            this.head = node;//空的话直接插进去
        }else {
            node.next = this.head;
            this.head = node;
        }

        //或者合二为一
        //node.next = this.head;//如果为空的话这行代码可以没有
        // this.head = node;
    }

    //打印单链表

    public void display() {
       Node cur = this.head;//定义一个cur等于则个单链表的头结点
       while (cur!=null) { // 当cur！=null说明单链表已经遍历完了
           System.out.print(cur.data+" ");//打印结点的数据
           cur = cur.next;//打印完第一个节点，让cur等于下一个节点
       }
        System.out.println();
    }

    //尾插法

    public void addLast(int data) {
        Node node = new Node(data);

        if(this.head == null) {//空链表
            //第一次插入
            this.head =node;//用head指向node
        }else {

            Node cur = this.head;
             while(cur.next != null) {
                 //如果cur.next不等于空，说明不是最后一个，让cur一直往后走
                cur = cur.next;

            }
            cur.next = node;//走到这说明cur.next为空了，到了链表尾部
        }
    }


    /**
     * 查找index-1位置
     * @param index 输入index找到index-1的引用，并返回
     * @return 找到返回引用
     */

    public Node searchPrev(int index) {

        int count = 0;
        Node cur = this.head;
        while (count < index-1 ) {
            cur = cur.next;
            count++;
        }

        return cur;

    }

    //检查插入的index是否合法

    public boolean checkIndex(int index) {
        if(index < 0 || index > this.getLength()) {
            System.out.println("插入位置不合法");
            return false;
        }
        return true;
    }

    //任意位置插法

    public void addIndex(int index,int data) {

        if(!checkIndex(index)){
            return;
        }

        if(index == 0) {
            addFirst(data);
            return;//一定要写
        }

        if(index == this.getLength()) {
            addLast(data);
            return;
        }

        Node cur = searchPrev(index);

        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
    }


    //获取单链表长度

    public int getLength() {

        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;

        }

        return count;
    }


    /**
     * 找数据所在的位置
     * @param key  输入一个数据，找出这个数据的前面一个位置
     * @return  返回前一个位置的引用
     */

    public Node searchPrevNode(int key) {
        Node cur = this.head;
        while (cur.next != null) {//判断单链表是否遍历到最后
            if(cur.next.data == key ) {//判断单链表中的数据是不是跟输入数据相等
                return  cur;//相等返回当前引用
            }
            cur = cur.next;//不相等cur往后走
        }
        return null;//遍历完这个单链表还没有找到返回null

    }

    //删除第一次出现关键字（数据）为key的节点

    //法一
    public void remove(int key) {
        if(this.head == null)
            return;

        //头节点是删除的节点
        if(this.head.data == key) {
            this.head = this.head.next;
        }else {
            Node cur = searchPrevNode(key);
            Node del = cur.next;
            cur.next = del.next;
        }
    }

    //法二：

//    public void remove(int key) {
//        if (this.head == null)
//            return;

        //头节点是删除的节点
//        if(this.head.data == key) {
//            this.head = this.head.next;
//            return;
//        }
//
//        Node cur  = searchPrevNode(key);
//        if(cur == null) {
//            System.out.println("没有你要删除的数字");
//            return;
//        }
//
//        Node del = cur.next;//del就是你要删除的节点
//        cur.next = del.next;
//    }
}
