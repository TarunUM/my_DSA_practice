package Leetcode.linkedlist;

public class ReorderList {
    public static void reorderList(ListNode head) {
        if (head==null || head.next==null){
            return;
        }
        ListNode node = head;
        ListNode mid = getMid(head);
        ListNode midReversed = ReverseLinkedList(mid);
        while (node != null && midReversed != null){
            ListNode temp1 = node.next;
            node.next = midReversed;
            node = temp1;
            temp1 = midReversed.next;
            if (temp1!=null){
                midReversed.next = node;
            }
            midReversed=temp1;
        }
    }

    private static ListNode ReverseLinkedList(ListNode head) {
        ListNode node = head;
        ListNode prevNode = null;
        while (node != null){
            ListNode temp = node.next;
            node.next = prevNode;
            prevNode = node;
            node = temp;
        }
        return prevNode;
    }

    private static ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
