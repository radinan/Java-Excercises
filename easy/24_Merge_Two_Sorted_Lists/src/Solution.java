public class Solution {
    public static void main(String[] args) {
        ListNode l14 = new ListNode(5);
        ListNode l13 = new ListNode(5, l14);
        ListNode l12 = new ListNode(5, l13);
        ListNode l11 = new ListNode(1, l12);

        ListNode l22 = new ListNode(2);
        ListNode l21 = new ListNode(1, l22);

        ListNode l3 = mergeTwoLists(l11, l21);
        System.out.println();
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return mergeTwoListsHelper(l1, l2);
    }

    private static ListNode mergeTwoListsHelper(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            return new ListNode(l1.val, mergeTwoListsHelper(l1.next, l2));
        } else {
            return new ListNode(l2.val, mergeTwoListsHelper(l1, l2.next));
        }
    }
}

