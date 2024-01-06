package Linked_List;

public class DSA_017_LC_Partition_List {
    public ListNode partition(ListNode head, int x) {
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(0);
        ListNode mark1 = head1;
        ListNode mark2 = head2;
        while (head != null) {
            if (head.val >= x) {
                mark2.next = head;
                mark2 = mark2.next;
            } else {
                mark1.next = head;
                mark1 = mark1.next;
            }
            head = head.next;
        }
        mark2.next = null;
        mark1.next = head2.next;
        return head1.next;
    }
}
