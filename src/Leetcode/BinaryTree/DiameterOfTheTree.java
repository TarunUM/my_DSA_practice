package Leetcode.BinaryTree;

// 543. https://leetcode.com/problems/diameter-of-binary-tree/description/
public class DiameterOfTheTree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.left.left = new TreeNode(40);
        root.left.left.left = new TreeNode(60);
        root.left.left.left.left = new TreeNode(70);
        root.left.right = new TreeNode(50);
        root.right = new TreeNode(30);

        System.out.println(new DiameterOfTheTree().diameterOfBinaryTree(root));

    }
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root);
        return diameter;
    }

    int dfs(TreeNode root){
        if (root == null){
            return 0;
        }
        int lH = dfs(root.left);
        int lR = dfs(root.right);

        int dia = lR+lH+1;

        diameter = Math.max(diameter, dia);

        return Math.max(lH,lR)+1;
    }
}
