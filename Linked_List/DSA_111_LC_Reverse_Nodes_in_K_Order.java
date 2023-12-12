package Linked_List;

public class DSA_111_LC_Reverse_Nodes_in_K_Order {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode temp = dummyNode;
        int count = 0;
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }
        temp = dummyNode;
        while (temp.next != null) {
            if (count < k) break;
            int nodes = k - 1;
            ListNode tempNext = temp.next;
            ListNode first = temp.next;
            ListNode second = first.next;

            while (nodes-- > 0) {
                ListNode next = second.next;
                second.next = first;
                first = second;
                second = next;
            }
            count -= k;
            temp.next = first;
            tempNext.next = second;
            temp = tempNext;

        }

        return dummyNode.next;
    }
}
