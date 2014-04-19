//cci150 2.2

public class LinkedListUtil {
    public static ListNode findKthFromLastNode(ListNode head, int k) {
        if(head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        for(int i = 0; i < k; i++) {
            if(fast != null) {
                fast = fast.next;
            } else {
                return null;
            }
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int v) {
            val = v;
        }
    }
}
