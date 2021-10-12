public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        //find half
        ListNode firstHalfEnd = findHalf(head);
        //reverse half
        ListNode secondHalfStart = reverseList(null, firstHalfEnd.next);
        //compare halves
        while (secondHalfStart != null) {
            if (head.val != secondHalfStart.val) {
                return false;
            }
            head = head.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

    private ListNode findHalf(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr.next != null && fastPtr.next.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    private ListNode reverseList(ListNode prevPtr, ListNode currPtr) {
        if (currPtr == null) return prevPtr;

        ListNode nextPtr = currPtr.next;
        currPtr.next = prevPtr;

        return reverseList(currPtr, nextPtr);
    }
}
