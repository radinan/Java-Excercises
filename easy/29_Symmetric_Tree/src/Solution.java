public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return false;
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode rootL, TreeNode rootR) {
        if(rootL == null && rootR == null) {
            return true;
        }
        else if (rootL != null && rootR != null) {
            if (rootL.val != rootR.val) return false;
            return helper(rootL.left, rootR.right) && helper(rootR.left, rootL.right);
        }
        else {
            return false;
        }
    }
}
