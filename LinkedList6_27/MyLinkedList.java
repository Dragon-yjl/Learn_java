package LinkedList6_27;


class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

}

public class MyLinkedList {

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

    public Node middleNode () {

        Node slow = this.head;
        Node fast =  this.head;

        while (fast != null && fast.next != null) {

            fast =  fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public int size() {

        Node cur = this.head;
        int count = 0;

        while (cur != null) {

            count ++;
            cur = cur.next;

        }

        return count;
    }

    /**
     * 反转链表
     * @return 返回新链表的头结点
     */

    public Node reverseList () {

        if(this.head == null)
            return null;

        Node newHead = null;
        Node prev = null;
        Node cur = this.head;

        while (cur != null) {
            if(cur.next == null) {
                newHead = cur;
            }
            Node curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;

        }


        return this.head = newHead;
    }
}
