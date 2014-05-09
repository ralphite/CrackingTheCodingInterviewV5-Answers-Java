//cci150 4.7

import java.util.*;

class TreeNode {
    int val;
    TreeNode parent;
}

public class TreeNodeUtils {
    public static TreeNode findFirstCommonAncestor(TreeNode a, TreeNode b) {
        if(a==null || b==null) return null;
        int aDepth = calcDepth(a);
        int bDepth = calcDepth(b);
        int diff = Math.abs(aDepth - bDepth);
        if(aDepth > bDepth) {
            while(diff-- > 0) {
                a = a.parent;
            }
        } else {
            while(diff-- > 0) {
                b = b.parent;
            }
        }
        while(a != b) {
            a = a.parent;
            b = b.parent;
        }
        return a;
    }
    private static int calcDepth(TreeNode node) {
        int d = 0;
        while(node!=null) {
            node = node.parent;
            d++;
        }
        return d;
    }
}

/*

find depth of a and b
for the deeper one, move up abs(a-b) first
then check if a and b are identical and move up both till a and b are identical

*/
