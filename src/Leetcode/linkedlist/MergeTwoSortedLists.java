package Leetcode.linkedlist;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        ListNode head = new ListNode();
        ListNode temp = head;
        while (list1 != null && list2 != null){
            if (list1.val > list2.val){
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            } else {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }
        }
        temp.next = (list1!=null) ? list1 : list2;
        return head.next;
    }

    public static void main(String[] args) {
        ListNode list13 = new ListNode(4);
        ListNode list12 = new ListNode(2, list13);
        ListNode list1 = new ListNode(1,list12);

        ListNode list23 = new ListNode(4);
        ListNode list22 = new ListNode(3, list23);
        ListNode list2 = new ListNode(1,list22);

        MergeTwoSortedLists main = new MergeTwoSortedLists();
        ListNode head = main.mergeTwoLists(list1, list2);
        while (head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
    }
}
