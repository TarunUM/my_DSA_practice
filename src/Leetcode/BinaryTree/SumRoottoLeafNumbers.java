package Leetcode.BinaryTree;

public class SumRoottoLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return calculate(root, 0);
    }

    int calculate(TreeNode root, int sum){
        if (root == null){
            return 0;
        }
        sum = (sum*10)+root.val;
        return calculate(root.left, sum) + calculate(root.right, sum);
    }
}
