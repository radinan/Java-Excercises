import java.util.HashSet;
import java.util.Set;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1, new HashSet<Integer>());
    }

    private TreeNode buildTree(int[] nums, int start, int end, Set<Integer> visited) {
        if (visited.contains(start) || visited.contains(end)) return null;

        int mid = start + (end - start + 1) / 2;
        visited.add(mid);

        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums, start, mid - 1, visited);
        root.right = buildTree(nums, mid + 1, end, visited);
        return root;
    }
}
