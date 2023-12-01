package Linked_List;

public class DSA_001_LC_Remove_Duplicate {
    public static void removeDuplicates(ListNode head){
        ListNode node = head;

        while(node.next != null){
            if (node.next != null && node.val == node.next.val){
                node = node.next.next;
            }
        }
    }
}
