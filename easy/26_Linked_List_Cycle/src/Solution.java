import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> allNodes = new HashSet<>();
        while(head != null) {
            if (allNodes.contains(head)) {
                return true;
            }

            allNodes.add(head);
            head = head.next;
        }

        return false;
    }
}
