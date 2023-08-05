package Leetcode.linkedlist;

public class ReverseList {
    public static ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode prevNode = null;
        ListNode node = head;

        while (node != null){
            ListNode temp = node.next;
            node.next = prevNode;
            prevNode = node;
            node = temp;
        }
        return prevNode;
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null){
            return head;
        }
        if (left == right){
            return head;
        }
        ListNode dummyHead = new ListNode(0, head);
        ListNode PP = dummyHead;
        ListNode C = head;

        for (int i=1; i<left; i++){
            PP = PP.next;
            C = C.next;
        }

        ListNode PN = null;
        ListNode NE = C;

        for (int i=left; i<=right; i++){
            ListNode temp = C.next;
            C.next = PN;
            PN = C;
            C = temp;
        }

        PP.next = PN;
        NE.next = C;

        return dummyHead.next;
    }
}
