package Leetcode.BinaryTree;

import java.util.Arrays;

//105. Construct Binary Tree from Preorder and Inorder Traversal
public class ConstructBinaryTreefromPreorderandInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0){
            return null;
        }
        int rootVal = preorder[0];
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootVal){
                index = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);

        root.left = buildTree(
                Arrays.copyOfRange(preorder, 1 , index+1),
                Arrays.copyOfRange(inorder, 0, index)
        );

        root.right = buildTree(
                Arrays.copyOfRange(preorder, index+1, preorder.length),
                Arrays.copyOfRange(inorder, index+1, inorder.length)
        );

        return root;
    }
}
