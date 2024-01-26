package Leetcode.BinaryTree;

//116. Populating Next Right Pointers in Each Node
public class NetRightPointers {

    public Node connect(Node root) {
        if (root == null){
            return root;
        }

        Node LM = root;

        while(LM.left != null){
            Node CN = LM;

            while(CN != null){
                CN.left.next = CN.right;
                if (CN.next != null){
                    CN.right.next = CN.next.left;
                }
                CN = CN.next;
            }

            LM = LM.left;
        }

        return root;
    }
}
