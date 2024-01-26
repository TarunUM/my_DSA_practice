package Leetcode.BinaryTree;

import java.util.ArrayList;

public class KThSmallest {
    public int kthSmallest(TreeNode root, int k) {
        return helper(root, k).val;
//        return BSTtoList(root,new ArrayList<>(), k).get(k);
    }

    public ArrayList<Integer> BSTtoList(TreeNode root, ArrayList<Integer> list, int k){
        if (root == null){
            return null;
        }
        ArrayList<Integer> left = BSTtoList(root.left,list, k);
        list.add(root.val);
        ArrayList<Integer> right = BSTtoList(root.right,list, k);

        if (list.size() == k){
            return list;
        }

        return list;
    }

    int count = 0;
    public TreeNode helper(TreeNode root, int k){
        if (root == null){
            return null;
        }
        TreeNode left = helper(root.left, k);
        if (left != null){
            return left;
        }
        count++;
        if (count == k){
            return root;
        }

        return helper(root.right, k);
    }
}
