package LinkedList;


class ListNode {

    int val;
    ListNode next;

    ListNode(int x) { val = x; }
}

public class RemoveKey {

    public ListNode deleteNode (ListNode head, int val) {
        if(head == null) {
            return null;
        }
        if(head.val == val ) {
            return head.next;
        }

        ListNode cur = head;
        ListNode prev = head;

        while (cur != null) {
            if(cur.val == val) {
                prev.next = cur.next;
            }
            prev = cur;
            cur = cur.next;

        }

        return head;
    }

  
}
