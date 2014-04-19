//cci150 2.4

public class LinkedListUtil {
    public static ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(1 << 31);
        ListNode nonless = new ListNode(1 << 31);
        ListNode lessCurr = less;
        ListNode nonlessCurr = nonless;
        ListNode curr = head;
        if(curr != null) {
            if(curr.val < x) {
                lessCurr.next = curr;
                lessCurr = lessCurr.next;
                curr = curr.next;
            } else {
                nonlessCurr.next = curr;
                nonlessCurr = nonlessCurr.next;
                curr = curr.next;
            }
        }
        lessCurr.next = nonless.next;
        nonlessCurr.next = null;
        return less.next;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int v) {
            val = v;
        }
    }
}
