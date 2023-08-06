package Leetcode.linkedlist;

public class SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummyHead = new ListNode(0, head);
        ListNode PrevPart = dummyHead;
        ListNode C = PrevPart.next;
        ListNode Ne = C;
        ListNode Nh = C.next;

        while(C != null && C.next != null){
            Ne = C;
            Nh = C.next;
            C = Nh.next;
            Nh.next = Ne;
            Ne.next = C;
            PrevPart.next = Nh;
            PrevPart = Ne;
        }
        return dummyHead.next;
    }
}
