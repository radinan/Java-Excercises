public class Solution {
    public ListNode reverseList(ListNode head) {
        return reverseListHelper(null, head);
    }

    private ListNode reverseListHelper(ListNode prevPtr, ListNode currPtr) {
        if (currPtr == null) {
            return prevPtr;
        }
        
        ListNode nextPtr = currPtr.next;
        currPtr.next = prevPtr;

        return reverseListHelper(currPtr, nextPtr);
    }
}
