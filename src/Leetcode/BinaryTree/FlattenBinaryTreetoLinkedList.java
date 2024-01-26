package Leetcode.BinaryTree;

public class FlattenBinaryTreetoLinkedList {

    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        // find the right most child on left and just paste the root.right there
        TreeNode curr = root;
        while(curr != null) {
            if (curr.left != null){
                TreeNode temp = curr.left;
                while (temp.right != null){
                    temp = temp.right;
                }
                temp.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
}
