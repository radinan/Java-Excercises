public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode prevPtr = null;
        ListNode currPtr = head;
        ListNode nextPtr = head.next;

        while (nextPtr != null) {
            currPtr.next = prevPtr;

            prevPtr = currPtr;
            currPtr = nextPtr;
            nextPtr = nextPtr.next;
        }
        
        currPtr.next = prevPtr;
        return currPtr;
    }
}
