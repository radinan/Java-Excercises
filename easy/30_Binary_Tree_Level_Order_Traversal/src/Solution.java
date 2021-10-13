import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ordered = new ArrayList<>();
        helper(root, 0, ordered);
        return ordered;
    }

    private void helper(TreeNode root, int lvl, List<List<Integer>> list) {
        if (root == null) return;
        if (lvl >= list.size()) {
            list.add(new ArrayList<Integer>());
        }
        list.get(lvl).add(root.val);
        helper(root.left, lvl + 1, list);
        helper(root.right, lvl + 1, list);
    }
}
