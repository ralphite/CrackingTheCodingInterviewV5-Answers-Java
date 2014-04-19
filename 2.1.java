//cci150 2.1

import java.util.HashSet;

public class LinkedListUtil {
    //use a temp buffer
    public static ListNode removeDuplicates(ListNode head) {
        if(head == null) return head;
        HashSet<Integer> set = new HashSet<Integer>();
        ListNode result = head;
        ListNode curr = head.next;
        set.add(head.val);
        while(curr != null) {
            if(set.contains(curr.val)) {
                curr = curr.next;
            } else {
                set.add(curr.val);
                result.next = curr;
                result = result.next;
                curr = curr.next;
            }
        }
        result.next = null;
        return head;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int v) {
            val = v;
        }
    }
}
