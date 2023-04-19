//package Leet;
//
////https://leetcode.com/problems/add-two-numbers/
//
//import java.util.LinkedList;
//
//public class addTwoNumbersLinkedList {
//    public static <ListNode> void main(String[] args) {
//        LinkedList<Integer> l1 = new LinkedList<Integer>();;
//        LinkedList<Integer> l2 = new LinkedList<Integer>();
//        l1.add(2);
//        l1.add(4);
//        l1.add(4);
//        l2.add(5);
//        l2.add(6);
//        l2.add(4);
//        System.out.println(l1);
//    }
//
//    public LinkedList addTwoNumbers(LinkedList l1, LinkedList l2){
//        LinkedList<Integer> result = new LinkedList<>();
//        int carry = 0;
//        while(l1 != null || l2 != null || carry != 0){
//            int adder = carry;
//            if(l1 != null){
//                adder += l1.val;
//            }
//            if(l2 != null){
//                adder += l2.val;
//            }
//            adder = adder%10;
//            carry = (carry + l1.val + l2.val)/10 ;
//            result.val = adder;
//            carry = (carry + l1.val + l2.val)/10 ;
//            result.val = adder;
//            result.next = new LinkedList<Integer>();
//            result = result.next;
//            l1 = l1.next;
//            l2 = l2.next;
//        }
//        return result;
//    }
//}
