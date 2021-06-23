package LinkedList623;

class  Node{
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList1 {

    public Node head;


    public void addFirst(int data) {

        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }


    public void display() {
        Node cur = this.head;

        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }


    /**
     * 求倒是第k个节点
     * @param k 输入一个k，
     * @return  返回倒数第k个节点的引用
     */
    public Node findKthToTail(int k) {
        if(k <= 0 || this.head == null) {
            System.out.println("输入K值有误");
            return null;
        }

        Node fast = this.head;
        Node slow = this.head;
        //先让fast走k-1步
        while (k-1>0) {
            if(fast.next != null) {
                fast = fast.next;
                k--;
            }else {//fast.next为空的时候，说明fast走到最后，k还没走完，说明K值大于链表长度
                System.out.println("K值过大");
                return null;
            }
        }

        //判断fast走完没有，没走完一起走，走完位置，此时slow就是倒数第K个值
        while (fast.next !=  null) {
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

        Node bs = null;//比x小的一段的头结点
        Node be = null;//比x小的一段的尾结点

        Node as = null;//比x大的一段的头结点
        Node ae = null;//比x大的一段的尾结点

        Node cur = this.head;

        while (cur != null) {
            if(cur.data < x) {

                //全部进行尾插法
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

        if(be == null) {

            return this.head = as;
        }
        be.next = as;
        //如果as== null 也可以正常打印，毕竟是尾插法，be.next肯定为null
        if(as != null) {
            ae.next = null;

        }

        return this.head = bs;
    }


    public Node removeSameData () {

        Node newHead =new Node(-1) ;//傀儡节点
        Node tmp = newHead;//保存头结点

        Node cur = this.head;

        while (cur != null) {

            if(cur.next != null && cur.data == cur.next.data) {

                //while循环把所有的相同的节点都走一遍
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;

                }
                cur = cur.next;//cur多走一步才能会死不一样的data

            }else {
                tmp.next = cur;
                tmp = cur;
                cur = cur.next;

            }

        }

        tmp.next =null;//如果把最后一个节点删除了，我们就必须让新链表最后一个节点置空
        return this.head = newHead.next;
    }
}
