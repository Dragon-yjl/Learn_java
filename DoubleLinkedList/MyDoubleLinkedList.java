package DoubleLinkedList;

class ListNode {

    public int data;
    public ListNode prev;//前驱
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

}

public class MyDoubleLinkedList {

    public ListNode head;//头结点
    public ListNode tail;//尾结点

    public void addFirst(int data) {

        ListNode node = new ListNode(data);

        if(this.head != null) {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }else {
            this.head = node;
            this.tail = node;
        }

        //改进
//        if(this.head != null) {
//            node.next = this.head;
//            this.head.prev = node;
//        }
//        this.head = node;
    }

    public void addLast(int data) {

        ListNode node = new ListNode(data);

        if(this.head == null) {
            this.head = node;
            this.tail = node;
        }else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public void display () {

        ListNode cur = this.head;

        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public int size () {

        ListNode cur = this.head;
        int count = 0;

        while (cur != null) {
            count++;
            cur = cur.next;
        }

        return count;
    }

    /**
     * 找到index所在位置的节点
     * @param index
     * @return 返回这个位置的节点
     */

    public ListNode searchIndex (int index) {

        ListNode cur = this.head;

        while (index > 0) {
            cur = cur.next;
            index --;
        }

        return cur;
    }

    /**
     *任意位置插入
     * @param index 这个位置
     * @param data 位置上要插入的数据
     */
    public void addIndex(int index, int data) {

        if(index < 0 || index > size())
            return;

        if(index == 0) {
            addFirst(data);
            return;
        }

        if(index == size()) {
            addLast(data);
            return;
        }

        ListNode cur = searchIndex(index);
        ListNode node = new ListNode(data);

        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;

    }


    /**
     * 删除第一次出现的key值
     * @param key 要删除的值
     */

    public void removeFirstKey(int key) {

        ListNode cur = this.head;

        while (cur != null) {

            if(cur.data == key) {
                //一定要判断删除的是不是头结点，否则会空指针异常
                if(cur == this.head) {//删除的是头结点
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {//删除的不是头结点
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        //删除的不是尾结点
                        cur.next.prev = cur.prev;
                    }else {//删除的是尾结点
                        this.tail = cur.prev;
                    }
                }

                //第一个出现的key删除完成
                return;


            }else {
                cur = cur.next;

            }
        }

    }
    /**
     * 删除所有数据为key的节点
     * @param key 要删除的数据
     */

    public void removeAllKey(int key) {

        ListNode cur = this.head;

        while (cur != null) {

            if(cur.data == key) {
                //一定要判断删除的是不是头结点，否则会空指针异常
                if(cur == this.head) {//删除的是头结点
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {//删除的不是头结点
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        //删除的不是尾结点
                        cur.next.prev = cur.prev;
                    }else {//删除的是尾结点
                        this.tail = cur.prev;
                    }
                }

            }
            cur = cur.next;
        }

    }


    /**
     * 清楚链表，不能光吧头结点置空，因为后面的节点引用了头结点，
     * 要用cur遍历，所有的前驱prev和next都置空
     * 最后把头结点和尾结点置空
      */
    public void clear() {

        ListNode cur = this.head;

        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = null;
            cur.prev = null;
            cur = curNext;
        }

        this.head = null;
        this.tail = null;
    }

}
