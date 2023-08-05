package Leetcode.linkedlist;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode list = new ListNode();
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode temp = head;
        while (temp.next!=null){
            if (temp.val == temp.next.val){
                temp.next =null;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}
