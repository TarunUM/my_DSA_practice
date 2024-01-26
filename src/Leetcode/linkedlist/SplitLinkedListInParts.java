package Leetcode.linkedlist;

import java.util.Arrays;

public class SplitLinkedListInParts {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);

        SplitLinkedListInParts spl = new SplitLinkedListInParts();

        ListNode[] ans = spl.splitListToParts(head, 3);
        Arrays.stream(ans).forEach(spl::display);
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];

        if (head == null){
            return ans;
        }

        int size = LLSize(head);
//        ListNode reversed = reverseLL(head);
        int count = 0;
        while(head!=null && k>0){
            int nti = size/k;
            if (size%k >0){
                nti++;
            }
            ListNode newHead = head;
            ListNode prevNode = null;
            for (int i = 0; i < nti; i++) {
                ListNode temp = head.next;
                prevNode = head;
                head = temp;
            }
            prevNode.next = null;
            ans[count] = newHead;
            count++;
            size -= nti;
            k--;
        }

//        while(reversed != null && k>0){
//            int nti = size / k;
//            ListNode tempHead = reversed;
//            ListNode node = reversed;
//            ListNode nextNode = node.next;
//            for (int i = 0; i < nti; i++) {
//                node = node.next;
//                nextNode = node.next;
//            }
//            node.next = null;
//            reversed = nextNode;
//            ans[count] = tempHead;
//            count++;
//            k--;
//            size -= nti;
//        }
        return ans;
    }

    private int LLSize(ListNode head){
        if (head == null){
            return 0;
        }
        int count =0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }


    private void display(ListNode head){
        if (head == null){
            System.out.println("null");
        }
        while (head != null){
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println();
    }
}
