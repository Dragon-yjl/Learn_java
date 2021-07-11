package Linked;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        solution.isPail(head);

    }
    /**
     * 
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public ListNode middleNode (ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null ) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public boolean isPail (ListNode head) {
        // write code here
        if(head == null) {
            return true;
        }
        
        if(head.next == null) {
            return true;
        }
        ListNode mid = middleNode(head);
        ListNode cur = mid.next;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = mid;
            mid = cur;
            cur = curNext;
        }
        while (mid != head) {
            if(mid.val != head.val) {
                return false;
            }
            
//             if(head.next.val == mid.val) {
//                 return true;
//             }
            head = head.next;
            mid = mid.next;
        }
        return true;
        
    }
}