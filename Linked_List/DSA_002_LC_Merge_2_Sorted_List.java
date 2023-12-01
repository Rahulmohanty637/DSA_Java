package Linked_List;

public class DSA_002_LC_Merge_2_Sorted_List {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode();
        ListNode head = node;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                head.next = list1;
                list1 = list1.next;
            }else{
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        head.next = (list1 != null)? list1:list2;
        return node.next;
    }
}
