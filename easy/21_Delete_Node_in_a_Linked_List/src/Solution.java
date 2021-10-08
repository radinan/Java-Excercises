public class Solution {
    public static void main(String[] args) {
        ListNode n4 = new ListNode(9, null);
        ListNode n3 = new ListNode(1, n4);
        ListNode n2 = new ListNode(5, n3);
        ListNode n1 = new ListNode(4, n2);

        deleteNode(n2);
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
