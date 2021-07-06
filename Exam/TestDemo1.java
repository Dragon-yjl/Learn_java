package Exam;

import exception.Test;

import java.time.Year;

class Node {
    public int data;
    public Node next;


    public Node(int data) {
        this.data = data;
    }
}
public class TestDemo1 {

    public Node head;

    public Node func(Node l1,Node l2) {
        if(l1 == null) {
            return l2;
        }

        if(l2 == null) {
            return l1;
        }

        Node newHead = null;
        if(l1.data < l2.data) {
            newHead = l1;
            newHead.next = func(l1.next,l2);
        }else {
            newHead = l2;
            newHead.next = func(l1,l2.next);
        }
        return newHead;
    }


    public  Node  func1(Node l1,Node l2) {

        if(l1 != null && l2 != null) {
            return null;
        }

        Node newHead = new Node(-1);
        Node cur = newHead;

        while (l1 != null && l2!=null) {
            if(l1.data < l2.data) {
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }

            cur = cur.next;
        }
        if(l1 != null) {
            cur.next = l1;
        }
        if(l2 != null) {
            cur.next = l2;
        }

        return newHead.next;
    }


    public static void main1(String[] args) {
        Node node1 = new Node(2);
        node1.next = new Node(5);
        node1.next.next= new Node(9);

        Node node2 = new Node(3);
        Node node3 = new Node(4);
        node2.next = node3;

        TestDemo1 testDemo1 = new TestDemo1();

        Node cur = testDemo1.func1(node1,node2);

        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}
