package Linked_List;

public class DSA_015_LC_Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode temp = head;
        int n = 1;
        while (temp.next != null) {
            n++;
            temp = temp.next;
        }
        temp.next = head;
        k = k % n;
        n = n - k;

        ListNode newLast = head;
        for (int i = 0; i < n - 1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }
}
