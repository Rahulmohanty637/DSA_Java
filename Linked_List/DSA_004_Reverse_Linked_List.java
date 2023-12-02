package Linked_List;

import java.util.List;

public class DSA_004_Reverse_Linked_List {
    ListNode tail;

    //Using Recursion
    public void recursiveReverseList(ListNode node) {
        if (node == tail) {
            return;
        }
        recursiveReverseList(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // inplace reverse
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = head.next;

        while (pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            next = next.next;
        }
        return prev;
    }
}
