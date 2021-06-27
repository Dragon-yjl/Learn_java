package LinkedList0627;


class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList1 {

    public Node head;

    public  void addFirst (int data) {

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

            System.out.print(cur.data+ " ");
            cur = cur.next;
        }
        System.out.println();
    }


    /**
     * 求倒是第k个节点
     * @param k 输入一个k，
     * @return  返回倒数第k个节点的引用
     * 定义快慢指针，让快一点的指针先走k-1步，再让他俩一起走，快指针走到最后一个节点的时候·
     * 慢指针所知的位置就是倒数第K个节点
     */
    public Node findKthToTail(int k) {

        if(k <= 0 || this.head == null) {

            System.out.println("输入K值有误");
            return null;
        }

        Node slow = this.head;
        Node fast =  this.head;

        while ( k-1 > 0) {
            if(fast.next != null) {
                fast = fast.next;
                k--;
            }else {
                System.out.println("K值过大·");
                return  null;
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

        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;

        Node cur = this.head;

        while (cur != null) {
            if(cur.data < x) {

                if(bs == null) {
                    bs = cur;
                    be = bs;

                }else {
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

        if(bs == null){
            return this.head = as;
        }

        be.next = as;

        if(as != null) {
            ae.next = null;
        }

        return this.head = bs;
    }
}
