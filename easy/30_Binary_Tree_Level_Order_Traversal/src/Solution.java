import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new LinkedList<List<Integer>>();

        Queue<TreeNode> visited = new LinkedList<TreeNode>();
        List<List<Integer>> ordered = new LinkedList<List<Integer>>();

        visited.add(root);
        while (!visited.isEmpty()) {
            int nodes = visited.size();

            List<Integer> slot = new LinkedList<Integer>();
            for (int i = 0; i < nodes; ++i) {
                TreeNode head = visited.poll();
                slot.add(head.val);

                if (head.left != null) visited.offer(head.left);
                if (head.right != null) visited.offer(head.right);
            }
            ordered.add(slot);
        }

        return ordered;
    }
}
