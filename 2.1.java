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

    //no temp buffer
    public static ListNode removeDuplicates2(ListNode head) {
        if(head == null) return head;
        ListNode result = head;
        int resultLen = 1;
        ListNode curr = head.next;
        while(curr != null) {
            ListNode n = head;
            boolean containsDuplicate = false;
            for(int i = 0; i < resultLen; i++) {
                if(n.val == curr.val) {
                    curr = curr.next;
                    containsDuplicate = true;
                    break;
                }
                n = n.next;
            }
            if(!containsDuplicate) {
                result.next = curr;
                curr = curr.next;
                result = result.next;
                resultLen++;
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
