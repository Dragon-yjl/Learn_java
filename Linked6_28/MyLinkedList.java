package Linked6_28;


class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList {

    public Node head;


    public void addFirst (int data) {

        Node node = new Node(data);

        if(this.head == null) {
            this.head = node;
        }else {

            node.next  = this.head;
            this.head = node;
        }
    }


    public void display () {

        Node cur = this.head;

        while (cur != null) {

            System.out.print(cur.data + " ");
            cur = cur.next;
        }

        System.out.println();
    }


    public int size () {

        Node cur = this.head;
        int count = 0;

        while (cur != null) {

            count ++;
            cur = cur.next;
        }

        return count;
    }


    public Node middleNode () {

        Node fast = this.head;
        Node slow = this.head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    /**
     * 遍历链表中所有数据，比x小的放在左边，其余的放在右边
     * @param x 输入x，与链表data、比大小
     * @return 返回新链表的头结点
     */

    public Node partition (int x) {

        Node cur = this.head;

        Node bs = null;
        Node be = null;

        Node as = null;
        Node ae = null;

        while (cur != null) {

            if(cur.data < x) {

                if(bs == null) {

                    bs = cur;
                    be = bs;

                }else {

                    be.next = cur;
                    be =cur;

                }

            }else

                if(as == null) {

                    as = cur;
                    ae = as;

                }else {

                    ae.next = cur;
                    ae = cur;
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

        Node newHead = new Node(-1);//傀儡节点
        Node tmp = newHead;

        Node cur = this.head;

        if(cur.next != null  && cur.data == cur.next.data) {

            while (cur.next != null  && cur.data == cur.next.data) {
                cur  = cur.next;
            }
            cur = cur.next;
        }else {

            tmp.next = cur;
            tmp = cur;
            cur = cur.next;
        }

        tmp.next = null;
        return this.head = newHead.next;
    }
}
