package LinkedList0623;

class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList2 {

    public  Node head;

    public void addFirst(int data) {

        Node node = new Node(data);
        if(this.head == null) {
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
     * 判断链表是不是回文链表
     * @return 是返回true，不是返回false
     */
    public boolean chkPalindrome() {

        if(this.middleNode() == null) {
            return false;
        }

        if(this.head.next == null) {
            return true;
        }

        //1.找到中间节点
        Node midNode = middleNode();

        //2.反转
        Node cur = midNode.next;
        while (cur != null) {
            Node curNext = cur.next;

            cur.next = midNode;
            midNode = cur;
            cur = curNext;
            //此时midNode走到了最后一个节点
        }

        //3.判断data是否相同，一个从前往后走，一个从后往前走，直到相遇

        //自己写的
//       if(this.head.data == midNode.data) {
//           while (this.head == midNode) {
//               this.head = this.head.next;
//               midNode = midNode.next;
//           }
//           return true;
//       }
//       return false;

        //老师写的
        while (this.head != midNode) {
            if(this.head.data != midNode.data) {
                return false;
            }

            //为了偶数节点
            if(this.head.next == midNode) {
                return true;
            }


            this.head = this.head.next;
            midNode = midNode.next;
        }

        return true;

    }


    /**
     * 判断链表内部是不是有环
     * @return 有环返回true无环返回false
     * 定义两个引用，让一个走两步，一个走一步，如果相遇，说明有环
     * 为什么不能让一个走一步，一个走三步，因为他俩可能擦肩而过，相遇的时间确定
     */
    public boolean hasCycle() {

        Node slow = this.head;
        Node fast = this.head;


        while (fast != null && fast.next != null ) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
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

        Node slow = this.head;
        Node fast = this.head;


        while (fast != null && fast.next != null ) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
                slow = this.head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;

                }
                return slow;
            }
        }
        return null;
    }

}
