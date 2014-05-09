//cci150 4.6

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode next;
    TreeNode parent;
}

public class TreeNodeUtils {
    public static void populateNext(TreeNode root) {
        if(root == null) return;
        if(root.right == null) {
            root.next = root.parent;
        } else {
            TreeNode r = root.right;
            while(r.left != null) {
                r = r.left;
            }
            root.next = r;
        }
    }
}

/*

for any node n not null:
    if n.right==null:
        n.next=n.parent
    else:
        r=n.right
        while r.left!=null:
            r=r.left
        n.next=r

*/
