//cci150 2.7

import java.util.Stack;

public class LinkedListUtil {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return false;
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode curr = head;
        while(curr != null) {
            stack.push(curr);
            curr = curr.next;
        }
        curr = head;
        while(curr != null) {
            ListNode n = stack.pop();
            if(n.val != curr.val) return false;
            curr = curr.next;
        }
        return true;
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
