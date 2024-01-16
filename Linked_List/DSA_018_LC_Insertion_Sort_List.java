package Linked_List;

public class DSA_018_LC_Insertion_Sort_List {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr != null){
            if(curr.val >= prev.val){
                prev = curr;
                curr = curr.next;
            }else{
                ListNode temp = dummy;
                while(curr.val > temp.next.val){
                    temp = temp.next;
                }
                prev.next = curr.next;
                curr.next = temp.next;
                temp.next = curr;
                curr = prev.next;
            }
        }
        return dummy.next;
    }
}
