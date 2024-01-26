package Leetcode.BinaryTree;

// 297. https://leetcode.com/problems/serialize-and-deserialize-binary-tree/description/

import java.util.*;

public class SerializeandDeserializeBinaryTree {
    public static void main(String[] args) {
        SerializeandDeserializeBinaryTree obj = new SerializeandDeserializeBinaryTree();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.left = new TreeNode(6);
        root.right.left.right = new TreeNode(7);
        root.right.right = new TreeNode(5);

        System.out.println(obj.serialize(root));
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null){
            return null;
        }
        List<String> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                list.add(curr == null ? "n" : String.valueOf(curr.val));

                if (curr !=null){
                    queue.offer(curr.left);
                    queue.offer(curr.right);
                }
            }
        }
        int size = list.size()-1;

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i <= size; i++) {
            ans.append(list.get(i));
            if (i != size){
                ans.append(",");
            }
        }

        return ans.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data){
        if(data.isEmpty()) {
            return null;
        }
        String[] arr = data.split(",");
        var root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        int index = 0;
        while(!queue.isEmpty()) {
            var node = queue.poll();

            if(!arr[++index].equals("n")) {
                var left = new TreeNode(Integer.parseInt(arr[index]));
                node.left = left;
                queue.offer(left);
            }
            if(!arr[++index].equals("n")) {
                var right = new TreeNode(Integer.parseInt(arr[index]));
                node.right = right;
                queue.offer(right);
            }
        }

        return root;
    }
}
