//cci150 2.3

public class LinkedListUtil {
    public static void removeCurrentNode(ListNode node) {
        if(node == null) return;
        if(node.next == null) {
            node = null;
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int v) {
            val = v;
        }
    }
}
