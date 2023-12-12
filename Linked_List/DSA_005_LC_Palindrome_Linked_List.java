package Linked_List;

public class DSA_005_LC_Palindrome_Linked_List {
    public ListNode findMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = head.next;

        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }


    public boolean isPalindrome(ListNode head) {
        ListNode mid = findMiddle(head);
        ListNode headSecond = reverseList(mid);
        ListNode headFirst = head;
        while (headFirst != null && headSecond != null) {
            if (headFirst.val != headSecond.val) {
                return false;
            }
            headFirst = headFirst.next;
            headSecond = headSecond.next;
        }
        return true;
    }

}
