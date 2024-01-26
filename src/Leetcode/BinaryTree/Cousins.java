package Leetcode.BinaryTree;
//993. Cousins in Binary Tree
public class Cousins {

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root.val == x || root.val == y){
            return false;
        }

        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return (findLevel(root, xx, 0) == findLevel(root, yy, 0) && !sameParents(root, xx,yy));
    }

    private TreeNode findNode(TreeNode root, int x) {
        if (root == null){
            return null;
        }

        if (root.val == x ){
            return root;
        }

        TreeNode left = findNode(root.left, x);
        if (left != null){
            return left;
        }
        return findNode(root.right, x);
    }


    int findLevel(TreeNode root, TreeNode x, int level){
        if (root == null){
            return 0;
        }
        if (root == x){
            return level;
        }
        int left = findLevel(root.left, x, level+1);
        if (left != 0){
            return left;
        }
        return findLevel(root.right, x, level+1);
    }
    

    public boolean sameParents(TreeNode root, TreeNode x, TreeNode y){
        if(root == null){
            return false;
        }

        return (root.left == x && root.right == y) || (root.left == y && root.right == x) ||
                sameParents(root.left, x, y) || sameParents(root.right, x, y);
    }
}
