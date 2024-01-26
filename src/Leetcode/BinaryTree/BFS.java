package Leetcode.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }

        List<List<Integer>> ans = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> subList = new ArrayList<>(levelSize);

            for (int i=0; i<levelSize; i++){
                TreeNode currNode = queue.poll();
                subList.add(currNode.val);

                if (currNode.left!=null) {queue.offer(currNode.left);}
                if (currNode.right!=null) {queue.offer(currNode.right);}
            }

            ans.add(0, subList);
        }

        return ans;
    }
}
