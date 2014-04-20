//cci150 2.6

public class LinkedListUtil {
    public static ListNode findLoopBegin(ListNode head) {
        /*
            fast slow pointer to get to the loop
            find loop length len
            fast slow pointer again (fast pointer len nodes ahead)
        */
        if(head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                break;
            }
        }
        if(fast == null || fast.next == null) return null;
        fast = fast.next;
        int len = 1;
        while(fast != slow) {
            len++;
            fast = fast.next;
        }
        fast = head;
        slow = head;
        for(int i = 0; i < len; i++) {
            fast = fast.next;
        }
        while(slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int v) {
            val = v;
            next = null;
        }
    }
}
