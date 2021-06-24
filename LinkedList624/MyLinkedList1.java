package LinkedList624;


class Node  {
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

        if(this.head ==  null) {
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


    public Node partition (int x) {

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
                    be.next= cur;
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

    /**
     * 删除排序好的链表中的相同数据，
     * @return  返回新的头结点
     */

    public Node removeSameData () {

        Node newHead = new Node(-1);
        Node tmp = newHead;

        Node cur  =this.head;

        while (cur != null) {

            //走完所有相同的数据
            if(cur.next != null && cur.data == cur.next.data) {

                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }

                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = cur;
                cur = cur.next;
            }

        }

        tmp.next = null;//重要，不然最后两个一样的数据删不掉
        return this.head = newHead.next;

    }
}
