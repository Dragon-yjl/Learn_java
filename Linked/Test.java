package Linked;

public class Test {

    public static void main(String[] args) {

        TestDemo testDemo = new TestDemo();

        ListNode node1 = new ListNode(6);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node1.next.next = node3;
        node1.next.next.next = node4;

        ListNode head = testDemo.deleteDuplicates(node1);

        ListNode cur = head;

        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();

    }
}
