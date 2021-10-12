public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode originalPrev = head;
        ListNode originalNext = originalPrev.next;

        ListNode copyNext = new ListNode(originalPrev.val);

        while (originalNext != null) {
            ListNode copyPrev = new ListNode(originalNext.val);
            copyPrev.next = copyNext;
            copyNext = copyPrev;

            originalPrev = originalPrev.next;
            originalNext = originalNext.next;
        }

        return copyNext;
    }
}
