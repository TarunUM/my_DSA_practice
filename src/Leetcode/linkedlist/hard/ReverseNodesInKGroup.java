package Leetcode.linkedlist.hard;

import Leetcode.linkedlist.ListNode;

public class ReverseNodesInKGroup {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k < 2){
            return head;
        }
        ListNode node = head;

        while (node != null){
            ListNode nextNode;
            ListNode checkerHead = node;
            for (int i = 0; i<k-1; i++){
                node = node.next;
            }
            node = null;
            System.out.println(validNoOfNodes(checkerHead));
        }

        return null;
    }

    public static int validNoOfNodes(ListNode head){
        if (head == null){
            return 0;
        }
        ListNode temp = head;
        int k = 0;
        while(temp!=null){
            ++k;
            temp = temp.next;
        }
        return k;
    }
}
