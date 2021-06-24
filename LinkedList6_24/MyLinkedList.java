package LinkedList6_24;


import sun.security.util.AuthResources_it;

class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList {

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


    public int size () {

        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count ++;
            cur = cur.next;
        }
        return count;
    }


    public  Node middleNode () {


        Node slow = this.head;
        Node fast = this.head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public Node reverseList () {

        Node newHead = null;
        Node prev = null;
        Node cur = this.head;

        while (cur != null) {
            Node curNext = cur.next;

            if(cur.next == null) {
                newHead = cur;
            }
                cur.next = prev;
                prev = cur;
                cur = curNext;


        }
        return this.head = newHead;
    }


    public Node findKthToTail (int k) {

        if(k <= 0 || this.head == null) {
            System.out.println(" 您输入的k值有误");
            return null;
        }

        Node fast = this.head;
        Node slow = this.head;

        while ( k-1 > 0) {
            if(fast.next != null) {
                fast = fast.next;

            }else {
                System.out.println("K值过大");
                return null;
            }

            k--;

        }

        while ( fast.next != null) {
            fast = fast.next;
            slow  = slow.next;
        }
        return slow;

    }
}
