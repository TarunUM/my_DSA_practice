package Leetcode.linkedlist;

public class AAAMain {
    public static void main(String[] args) {
        ListNode list15 = new ListNode(5);
        ListNode list14 = new ListNode(4, list15);
        ListNode list13 = new ListNode(3, list14);
        ListNode list12 = new ListNode(2, list13);
        ListNode list1 = new ListNode(1, list12);

        display(list1);
        display(SwapNodesInPairs.swapPairs(list1));
    }

    public static void display(ListNode head){
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
