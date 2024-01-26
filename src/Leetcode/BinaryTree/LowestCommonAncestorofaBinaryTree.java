package Leetcode.BinaryTree;

import java.util.ArrayList;

//236. Lowest Common Ancestor of a Binary Tree
public class LowestCommonAncestorofaBinaryTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p ,q);
        TreeNode right = lowestCommonAncestor(root.right, p ,q);

        if (left!=null && right!=null){
            return root;
        }

        return left == null ? right : left;
    }
}
