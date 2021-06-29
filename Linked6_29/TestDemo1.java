package Linked6_29;


import LinkedList6_29.MyLinkedList;

public class TestDemo1 {

    /**
     * 把两个有序的链表串起来，
     * @param headA
     * @param headB
     * @return 返回新的链表的头结点
     * 1.定义一个傀儡节点
     * 2，比较两个链表的值
     * 3,值小的串到傀儡节点后面
     */
    public static Node mergeTwoList(Node headA,Node headB) {

        Node newHead = new Node(-1);
        Node tmp = newHead;

        //两个链表都有数据
        while (headA != null && headB != null) {
            if(headA.data < headB.data) {
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            }else {
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
        }

        //两种情况
        //要么A为null，要么B为null
        if(headA != null) {//说明B为null
            //headA剩下的所有数据，都是比headB里面数据大的
            tmp.next = headA;
        }

        if(headB != null) {//说明A为null
            tmp.next = headB;
        }

        return newHead.next;

    }

    public static void main(String[] args) {

        MyLinkedList1 myLinkedList = new MyLinkedList1();

        myLinkedList.addFirst(4444);
        myLinkedList.addFirst(222);
        myLinkedList.addFirst(90);
        myLinkedList.addFirst(1);

       MyLinkedList1 myLinkedList2 = new MyLinkedList1();

       myLinkedList2.addFirst(33333);
       myLinkedList2.addFirst(236);
       myLinkedList2.addFirst(77);
       myLinkedList2.addFirst(66);
       myLinkedList2.addFirst(9);

       Node ret = mergeTwoList(myLinkedList.head,myLinkedList2.head);


       Node cur = ret;

       while (cur != null) {
           System.out.print(cur.data+" ");
           cur = cur.next;
       }

        System.out.println();
    }

}
