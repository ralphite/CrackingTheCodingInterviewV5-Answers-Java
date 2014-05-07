//cci150 4.3

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int v) {
        val = v;
    }
}

public class TreeNodeUtils {
     public TreeNode sortedUniqArrayToBST(int[] arr) {
        if(arr==null || arr.length==0) return null;
        int mid = arr.length/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = sortedUniqArrayToBST(Arrays.copyOfRange(arr, 0, mid));
        root.right = sortedUniqArrayToBST(Arrays.copyOfRange(arr, mid+1, arr.length));
        return root;
     }
}
