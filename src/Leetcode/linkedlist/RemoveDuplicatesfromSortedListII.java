package Leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesfromSortedListII {

        public static ListNode deleteDuplicates(ListNode head) {
        /*
            1. create a dummy head which points to the given head
            2. create a node which tells prevParts End as it is already removed all duplicates
                ( Initially it will dummy because we ain't comparing it with anything )
            3. now keep on checking whether the Current.val Nodes and Next.val Nodes are same.
                if they are then connect the PrevParts End to the Next.next Node,
                And Update the PrevPartsEnd the Next.next Node.
        */

            if (head == null || head.next == null ){
                return head;
            }
            ListNode dummyHead = new ListNode(0);
            ListNode prevPart = dummyHead;
            ListNode curr = head;
    //        int checker = 0;

            while (curr != null){
                if (checkDup(curr)){
                    curr = jumper(curr);
                } else {
                    prevPart.next = curr;
                    prevPart = prevPart.next;
                    curr = curr.next;
                    prevPart.next = null;
                }
    //            if (curr.val == nextNode.val || curr.val == checker){
    //                checker = curr.val;
    //                curr = nextNode.next;
    //                prevPart.next = nextNode.next;
    //            } else {
    //                prevPart.next = curr;
    //                prevPart = prevPart.next;
    //                curr = curr.next;
    //            }
            }
            return dummyHead.next;
        }

        public static boolean checkDup(ListNode curr){
            return curr.next != null && curr.val == curr.next.val;
        }

        public static ListNode jumper(ListNode curr){
            if (curr == null){
                return null;
            }
            while (curr.next != null && curr.val == curr.next.val){
                curr = curr.next;
            }
            return curr.next;
        }
}
