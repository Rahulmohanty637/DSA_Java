package Linked_List;

public class DSA_016_LC_Swap_Nodes_In_Pairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode prev = dummyNode;
        ListNode curr = head;

        while (curr != null) {
            prev.next = curr.next;
            curr.next = prev.next.next;
            prev.next.next = curr;
            prev = curr;
            curr = curr.next;
        }
        return dummyNode.next;
    }
}
