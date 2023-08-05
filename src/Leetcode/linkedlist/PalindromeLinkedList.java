package Leetcode.linkedlist;

import java.util.List;

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode node = head;
        SortList sortList = new SortList();
        ListNode mid = sortList.getMid(node);

        ListNode headSecond = ReverseList.reverseList(mid);

        // Compare both halves
        while (node!= null && headSecond !=null){
            if (node.val != headSecond.val){
                return false;
            }
            node = node.next;
            headSecond = headSecond.next;
        }
        return true;
    }

}
