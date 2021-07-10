package LinkedList;




public class LinkedTest {

    public static void main(String[] args) {

        RemoveKey removeKey = new RemoveKey();


        ListNode head = new ListNode(8);
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(2);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        ListNode newHead = removeKey.deleteNode(head,5);

        ListNode cur = newHead;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();

    }
}
