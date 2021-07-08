package Linked;

class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class TestDemo {


    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                ListNode temp = curr.next;
                while (temp != null && temp.val == curr.val) {
                    temp = temp.next;
                }
                prev.next = temp;
                curr = temp;
            } else {
                prev = prev.next;
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
