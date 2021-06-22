package LinkedList622;


import com.sun.org.apache.bcel.internal.generic.RETURN;

class Node {

    public int data;
    public Node next;


    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList1 {

    public Node head;//头结点

    public void addFirst(int data) {

        Node node = new Node(data);
        if(this.head == null) {

            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }

    public void display () {
        Node cur = this.head;

        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public int middleNode() {

        Node slow = this.head;
        Node fast = this.head.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.data;
    }

    public Node reverseList () {

        Node cur = this.head;
        Node prev = null;
        Node newHead = null;

        while (cur != null) {
            Node curNext =cur.next;
            if(curNext == null) {
                newHead = cur;

            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }

        return this.head = newHead;
    }


    public Node findKthToTail(int k) {

        if(k<=0) {
            System.out.println("你输入K值有误");

            return null;
        }
        Node slow = this.head;
        Node fast = this.head;

        while (k-1>0) {

            if(fast.next != null) {
                fast = fast.next;
                k--;
            }else {
                System.out.println(" 你输入的K值有误");
                return null;
            }

        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    /**
     * 给一个数据，比这个数据小的放在链表前面，大的放在链表后面
     * @return 返回新链表的头结点
     */
    public Node partition(int x) {

        Node bs = null;//前面半部分链表的头结点
        Node be = null;//前面半部分链表的尾结点

        Node as = null;//后面半部分的头结点
        Node ae = null;//后面半部分的尾结点

        Node cur = this.head;

        while (cur != null) {
            if(cur.data < x) {

                if(bs == null) {
                    bs = cur;
                    be = bs;
                }else {//尾插法
                    be.next = cur;
                    be = cur;
                }
            }else {
                if(as == null) {
                    as = cur;
                    ae = as;
                }else {
                    ae.next = cur;
                    ae = cur;
                }

            }

            cur = cur.next;
        }

        if(bs == null) {
            return this.head = as;
        }
        be.next = as;
        if(as != null) {
            ae.next = null;
        }
        return this.head = bs;
    }
}
