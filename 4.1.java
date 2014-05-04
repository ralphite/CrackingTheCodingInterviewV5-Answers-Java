//cci150 4.1

public class TreeNodeUtils {
    public static boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        calcHeight(root);
        if(root.left == null && root.right == null) return true;
        if(root.left == null) return root.right.height == 1;
        if(root.right == null) return root.left.height == 1;
        return isBalanced(root.left) && isBalanced(root.right) &&
            Math.abs(root.left.height - root.right.height) <= 1;
    }
    private static void calcHeight(TreeNode root) {
        if(root==null) return;
        if(root.left==null && root.right==null) {
            root.height = 1;
            return;
        }
        if(root.left==null) {
            calcHeight(root.right);
            root.height = 1 + root.right.height;
        }
        if(root.right==null) {
            calcHeight(root.left);
            root.height = 1 + root.left.height;
        }
        calcHeight(root.left);
        calcHeight(root.right);
        root.height = 1 + Math.max(root.left.height, root.right.height);
    }
}
class TreeNode<V> {
    V value;
    int height;
    TreeNode left, right;
    TreeNode(V v) {
        value = v;
        left = null;
        right = null;
        height = -1;
    }
}
