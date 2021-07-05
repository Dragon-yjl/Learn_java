package reviewClass;

import java.security.PublicKey;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class LinkedList {

    public Node head;

    public void addFirst (int data) {

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


    public Node middleNode () {

        Node slow = this.head;
        Node fast = this.head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;
    }

    public boolean isPalindrome() {
        if (this.head == null) {
            return true;
        }
        
        if(this.head.next == null) {
            return true;
        }
        Node mid = middleNode();

        Node cur = mid.next;
        
        while (cur != null) {
            Node curNext = cur.next;
            cur.next = mid;
            mid = cur;
            cur = curNext;
        }
        
        cur = this.head;
        
        while (cur != mid) {
            if(cur.data != mid.data) {//奇数个节点
                return false;
            }
            if(cur.next.data == mid.data) {//偶数个结点
                return true;
            }
            cur = cur.next;
            mid = mid.next;
        }
        return true;
        
    }
}
