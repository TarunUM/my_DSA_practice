package Leetcode.linkedlist;

import java.util.List;
import java.util.function.DoubleUnaryOperator;

//https://leetcode.com/problems/sort-list/
public class SortList {

    public static void main(String[] args) {
        ListNode list14 = new ListNode(1);
        ListNode list13 = new ListNode(2, list14);
        ListNode list12 = new ListNode(3, list13);
        ListNode list1 = new ListNode(4, list12);

        SortList main = new SortList();
        ListNode unsorted = list1;
        while (list1!=null){
            System.out.print(list1.val + " -> ");
            list1 = list1.next;
        }
        System.out.println();
        ListNode sorted = main.sortList2(unsorted);
        while (sorted!=null){
            System.out.print(sorted.val + " -> ");
            sorted = sorted.next;
        }
    }

    // Using Bubble Sort
    public ListNode sortList2(ListNode head){
        ListNode outer = head;
        ListNode last =null;
        while (outer != null && outer.next != null){
            if(last == head){
                break;
            }
            ListNode inner = outer;

            while(inner != null && inner.next!=null && inner != last){
                if (inner.val > inner.next.val){
                    ListNode right = inner.next.next;
                    ListNode nextNode = inner.next;
                    inner.next = right;
                    if (inner == head){
                        head = nextNode;
                    }
                    nextNode.next = inner;
                }
                inner = inner.next;
            }
            last=inner;
        }
        return head;
    }

    // Using Merge Sort
    public ListNode sortList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }

//        ListNode rightNode = getMid(head);
//        ListNode temp = rightNode.next;
//        rightNode.next = null;
//        rightNode = temp;
//
//        ListNode left = sortList(head);
//        ListNode right = sortList(rightNode);

        ListNode mid = getMid2(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeList(left, right);
    }

    public ListNode mergeList(ListNode list1, ListNode list2) {
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

    public ListNode getMid(ListNode head){
        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode getMid2(ListNode head){
        if(head == null){
            return null;
        }
        ListNode midPrev = null;
        while(head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
