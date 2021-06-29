package LinkedList6_29;

public class TestDemo {

    //构造两个链表相交
    public static void creatCut(Node headA,Node headB) {
        headA.next = headB.next.next;
    }


    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addFirst(66);
        myLinkedList.addFirst(99);
        myLinkedList.addFirst(88);
        myLinkedList.addFirst(55);

//        myLinkedList.display();
//
//        System.out.println(myLinkedList.size());
//        System.out.println("=================");

        MyLinkedList myLinkedList1 = new MyLinkedList();

        myLinkedList1.addFirst(1);
        myLinkedList1.addFirst(99);
        myLinkedList1.addFirst(666);
        myLinkedList1.addFirst(66);
        myLinkedList1.addFirst(6);
        myLinkedList1.addFirst(345);


        creatCut(myLinkedList.head,myLinkedList1.head);


        Node ret = getIntersectionNode(myLinkedList.head,myLinkedList1.head);

        System.out.println(ret.data);




    }

    /**
     * 判断两个链表是否相交
     * @param headA
     * @param headB
     * @return 返回相交哪一点的地址
     */

    public  static Node getIntersectionNode(Node headA ,Node headB) {

        if(headA == null || headB == null) {
            return null;
        }

        Node cur1 = headA;
        Node cur2 = headB;

        int count1 = 0;
        int count2 = 0;

        while (cur1 != null) {
            count1 ++;
            cur1 = cur1.next;
        }

        while (cur2 != null) {
            count2 ++;
            cur2 = cur2.next;
        }

        //为了求长度，cur1 cur2都指向null了
        //一定要指回来
        cur1 = headA;
        cur2 = headB;

        if(count1 > count2) {
            int i = count1 - count2;
            while (i > 0) {
                cur1 = cur1.next;
                i--;
            }
        }else {
            int k = count2 - count1;
            while (k > 0) {
                cur2 = cur2.next;
                k--;
            }
        }

        while (cur1 != null) {
            cur1 = cur1.next;
            cur2 = cur2.next;

            if(cur1 == cur2) {
                return cur1;
            }
        }

        return null;

    }
}
