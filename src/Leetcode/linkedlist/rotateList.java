package Leetcode.linkedlist;

public class rotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k < 1 ){
            return head;
        }
        // first get size of the List
        int size = 0;
        ListNode fS = head;
        while (fS !=null){
            size++;
            fS = fS.next;
        }

        k %= size;
        if(k==0){
            return head;
        }

        // Making it circular LL
        ListNode fT =head; // fT = Tail
        while (fT.next != null){
            fT = fT.next;
        }
        fT.next = head;

        ListNode newHead = head;
        ListNode newTail = newHead;

        for (int i=0; i<size - k;i++){
            newTail = newHead;
            newHead = newTail.next;
        }
        head = newHead;
        newTail.next = null;
        return head;
    }

    public static ListNode rotateLeft(ListNode head, int k) {
        if (head == null || k < 1 ){
            return head;
        }
        // first get size of the List
        int size = 0;
        ListNode fS = head;
        while (fS !=null){
            size++;
            fS = fS.next;
        }

        k %= size;
        if(k==0){
            return head;
        }

        // Making it circular LL
        ListNode fT =head; // fT = Tail
        while (fT.next != null){
            fT = fT.next;
        }
        fT.next = head;

        ListNode newHead = head;
        ListNode newTail = newHead;

        for (int i=0; i<k;i++){
            newTail = newHead;
            newHead = newTail.next;
        }
        head = newHead;
        newTail.next = null;
        return head;
    }
}
