package LinkedList6_22;


import com.sun.org.apache.bcel.internal.generic.RETURN;

class Node {

    public int data;
    public Node next;


    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList {

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


    public Node  findKthToTail(int k) {

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
}
