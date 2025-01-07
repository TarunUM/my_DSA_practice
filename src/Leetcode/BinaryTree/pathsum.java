package Leetcode.BinaryTree;

public class pathsum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return root.val == targetSum;
        }
        return checkSum(root, 0, targetSum);
    }

    private boolean checkSum(TreeNode root, int sum, int target) {
        if (root == null) {
            return false;
        } else {
            sum += root.val;
            if (root.left == null && root.right == null) {
                return sum == target;
            }

            return checkSum(root.left, sum, target) || checkSum(root.right, sum, target);
        }
    }
}