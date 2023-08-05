package Leetcode.linkedlist;

public class LinkedListCycle {

    // EASY === LinkedListCycle - 1
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }


    // Medium === LinkedListCycle - 2
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                length = LengthCycle(slow);
                break;
            }
        }

        // Find the start node
        if (length == 0){
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        while (length > 0){
            second = second.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while (first != second){
            first = first.next;
            second = second.next;
        }
        return first;

    }

    // Medium === LinkedListCycle - 2
    public ListNode detectCycle2(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                fast = head;
                while (fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }

    public int LengthCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            fast = fast.next;
            if (fast == slow){
                do {
                    slow=slow.next;
                    ++length;
                }while (fast != slow);
                return length;
            }
        }

        return -1;
    }
}
