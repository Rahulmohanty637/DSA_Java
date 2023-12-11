package Linked_List;

public class DSA_014_LC_Reorder_List {

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
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }

    public ListNode findMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public void reorderList(ListNode head) {

        if (head == null || head.next == null){
            return;
        }
        ListNode mid = findMiddle(head);
        ListNode headSecond = reverseList(mid);
        ListNode headFirst = head;

        while (headFirst != null && headSecond != null){
            ListNode temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;

            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }
        if (headFirst != null){
            headFirst = null;
        }
    }
}
