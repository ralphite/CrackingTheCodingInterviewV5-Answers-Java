//cci150 2.5

import java.util.Stack;

public class LinkedListUtil {
    //reverse order store
    public static ListNode add1(ListNode n1, ListNode n2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carrier = 0;
        while(n1 != null && n2 != null) {
            int d = (n1.val + n2.val + carrier) % 10;
            carrier = (n1.val + n2.val + carrier) / 10;
            curr.next = new ListNode(d);
            curr = curr.next;
            n1 = n1.next;
            n2 = n2.next;
        }
        while(n1 != null) {
            int d = (n1.val + carrier) % 10;
            carrier = (n1.val + carrier) / 10;
            curr.next = new ListNode(d);
            curr = curr.next;
            n1 = n1.next;
        }
        while(n2 != null) {
            int d = (n2.val + carrier) % 10;
            carrier = (n2.val + carrier) / 10;
            curr.next = new ListNode(d);
            curr = curr.next;
            n2 = n2.next;
        }
        if(carrier > 0) {
            curr.next = new ListNode(carrier);
        }
        return dummy.next;
    }

    //forward order store. use a stack
    public static ListNode add2(ListNode n1, ListNode n2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> sum = new Stack<Integer>();
        while(n1 != null) {
            s1.push(n1.val);
            n1 = n1.next;
        }
        while(n2 != null) {
            s2.push(n2.val);
            n2 = n2.next;
        }
        int carrier = 0;
        while(!s1.isEmpty() && !s2.isEmpty()) {
            int d1 = s1.pop();
            int d2 = s2.pop();
            int d = (d1 + d2 + carrier) % 10;
            carrier = (d1 + d2 + carrier) / 10;
            sum.push(d);
        }
        while(!s1.isEmpty()) {
            int d1 = s1.pop(); 
            int d = (d1 + carrier) % 10;
            carrier = (d1 + carrier) / 10;
            sum.push(d);
        }
        while(!s2.isEmpty()) {
            int d2 = s2.pop(); 
            int d = (d2 + carrier) % 10;
            carrier = (d2 + carrier) / 10;
            sum.push(d);
        }
        if(carrier > 0) {
            sum.push(carrier);
        }
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(!sum.isEmpty()) {
            curr.next = new ListNode(sum.pop());
            curr = curr.next;
        }
        return dummy.next;
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
