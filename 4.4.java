//cci150 4.4

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
}

public class TreeNodeUtils {
     public ArrayList<LinkedList<TreeNode>> convertBinaryTreeToLinkedLists(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> r = new ArrayList<LinkedList<TreeNode>>();
        if(root==null) return r;
        LinkedList<TreeNode> level = new LinkedList<TreeNode>();
        level.add(root);
        while(!level.isEmpty()){
            r.add(level);
            LinkedList<TreeNode> nextLevel = new LinkedList<TreeNode>();
            for(int i = 0; i < level.size(); i++) {
                if(level.get(i).left!=null) nextLevel.add(level.get(i).left);
                if(level.get(i).right!=null) nextLevel.add(level.get(i).right);
            }
            level = nextLevel;
        }
        return r;
     }
}
