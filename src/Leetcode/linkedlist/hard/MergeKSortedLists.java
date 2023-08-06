package Leetcode.linkedlist.hard;

import Leetcode.linkedlist.ListNode;

public class MergeKSortedLists {
    public static ListNode mergeKLists(ListNode[] lists) {
        /*
        1. create a dummy head which points to the given head
        2. create a node which tells prevParts End as it is already remmoved all duplicates
            ( Initially it will dummy cause we ai'nt compaining it with anything )
        3. now keep om checking whether the prev Nodes and Current Nodes are same.
            if they then connect the PrevParts End to the next Node of Current.
         */
        ListNode dummyHead = new ListNode(0);
        return dummyHead.next;
    }
}
