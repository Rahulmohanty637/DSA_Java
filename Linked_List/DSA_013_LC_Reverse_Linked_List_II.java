package Linked_List;

import java.util.List;

public class DSA_013_LC_Reverse_Linked_List_II {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode prev = dummyNode;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        ListNode temp = null;
        for (int i = 0; i <= right - left; i++) {
            temp = prev.next;
            prev.next = curr.next;
            curr.next = curr.next.next;
            prev.next.next = temp;
        }
        return dummyNode.next;
    }
}
