package Leetcode.BinaryTree;
//98. https://leetcode.com/problems/validate-binary-search-tree/
public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode root, Integer low, Integer high){
        if(root == null){
            return true;
        }

        if (low != null && root.val <= low){
            return false;
        }

        if (high != null && root.val >= high){
            return false;
        }

        return helper(root.left, low, root.val) && helper(root.right, root.val, high );
    }
}
