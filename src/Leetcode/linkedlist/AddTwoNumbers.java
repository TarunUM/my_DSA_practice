package Leetcode.linkedlist;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        System.out.println(addTwoNumbers2(l1,l2).next.next.next.next.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        2 - 4 - 3
//        5 - 6 - 4
//       -----------
//        7 - 0 - 8
        int carry = 0;
        ListNode next1 = l1;
        ListNode next2 = l2;
        ListNode headAns = next2;
        while(next1 != null && next2 != null){
            int tempCarry = (next1.val + next2.val + carry) / 10;
            next2.val = (next1.val + next2.val + carry) % 10;
            carry = tempCarry;
            next1 = next1.next;
            next2 = next2.next;
        }
        while (next1!=null){
            int tempCarry = (next1.val + carry) / 10;
            next2 = new ListNode((next1.val + carry) % 10, new ListNode());
            carry = tempCarry;
            next1 = next1.next;
            next2 = next2.next;
        }
        while (next2!=null){
            int tempCarry = (next2.val + carry) / 10;
            next2.val = (next2.val + carry) % 10;
            carry = tempCarry;
            next2 = next2.next;
        }

        if (carry != 0 ){
            next2 = new ListNode(carry, null);
        }

        return headAns;
    }

    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
//        2 - 4 - 3
//        5 - 6 - 4
//       -----------
//        7 - 0 - 8
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }
}


