package Leetcode.BinaryTree;

public class findPath {
    public static boolean findPathRootToLeaf(TreeNode root, int[] arr){
        if (root == null) return arr.length == 0;

        return helper(root, arr, 0);
    }

    private static boolean helper(TreeNode root, int[] arr, int i) {
        if (root == null){
            return false;
        }
        if (i >= arr.length || root.val != arr[i]) return false;

        if (root.left == null && root.right == null && root.val == arr[i]) return true;

        return helper(root.left, arr, i+1) || helper(root.right, arr, i+1);
    }
}
