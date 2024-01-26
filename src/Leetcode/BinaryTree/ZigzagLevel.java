package Leetcode.BinaryTree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

// 103. Binary Tree Zigzag Level Order Traversal

public class ZigzagLevel {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        List<List<Integer>> ans = new ArrayList<>();

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offerLast(root);

        boolean reversed = false;
        while(!deque.isEmpty()){
            List<Integer> sublist = new ArrayList<>(1);
            int size = deque.size();

            if(!reversed){
                for (int i = 0; i < size; i++) {
                    TreeNode currNode = deque.pollFirst();
                    sublist.add(currNode.val);

                    if (currNode.left !=null) deque.offerLast(currNode.left);
                    if (currNode.right !=null) deque.offerLast(currNode.right);
                }
            } else {
                for (int i = 0; i < size; i++) {
                    TreeNode currNode = deque.pollLast();
                    sublist.add(currNode.val);

                    if(currNode.right !=null) deque.offerFirst(currNode.right);
                    if(currNode.left !=null) deque.offerFirst(currNode.left);
                }
            }

            reversed = !reversed;
            ans.add(sublist);
        }

        return ans;
    }
}
