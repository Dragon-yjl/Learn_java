package LinkedList6_28;


class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

}

public class MyLinkedList1 {

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
     * 判断链表是不是回文结构
     * @return 是回文返回true
     */
    public boolean chkPalindrome() {

        if(this.head == null) {
            return false;
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
        //mid到了链表最后

        while (this.head != mid) {
            assert mid != null;
            if(this.head.data != mid.data) {
                return false;
            }


            //偶数节点
            if(this.head.next == mid) {
                return true;
            }

            this.head = this.head.next;
            mid = mid.next;
        }

        return true;
    }


    /**
     * 判断链表是否有环
     * @return 有的话返回true
     * 定定义两个快慢指针，开的一次走两步，慢的走一步，如果相遇就说明有环，
     * 不能让快的一次走三步，走三步的话可能擦肩而过，相遇的时间不确定或者说不可能相遇
     */
    public boolean hasCycle() {

        Node fast = this.head;
        Node slow = this.head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                return true;
            }
        }

        return false;
    }

    /**
     * 判断链表有环的话进入环的第一个节点，没有返回null
     * @return 有环返回入口节点，无环返回null
     */
    public Node detectCycle() {

        Node fast = this.head;
        Node slow = this.head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
               fast = this.head;
               while (fast != slow) {
                   fast = fast.next;
                   slow  = slow.next;
               }
               return fast;
            }
        }

        return null;

    }
}
