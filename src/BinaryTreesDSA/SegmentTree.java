package BinaryTreesDSA;

public class SegmentTree {
    private class Node{
        int data;
        Node left;
        Node right;
        int start;
        int end;

        public Node(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    Node root;
    public SegmentTree(int[] arr){
        root = buildTree(arr, 0, arr.length-1);
    }

    private Node buildTree(int[] arr, int start, int end){
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }
        Node node = new Node(start, end);

        int mid = (start + end) / 2;
        node.left = buildTree(arr, start, mid);
        node.right = buildTree(arr, mid+1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display(){
        display(root);
    }

    public void display(Node root){
        if (root == null){
            return;
        }

        String str = "";
        if (root.left != null){
            str += "left node data = " + root.left.data + " [" + root.left.start + " - " + root.left.end + " ]";
        } else {
            str += "no left child";
        }

        str += "(left) \t <- root data = " + root.data + " [" + root.start + " - " + root.end + " ] -> \t (right)";

        if (root.right != null){
            str += "right node data = " + root.right.data + " [" + root.right.start + " - " + root.right.end + " ]";
        } else {
            str += "no right child";
        }

        System.out.println(str + "\n");

        if (root.left != null){
            display(root.left);
        }

        if (root.right != null){
            display(root.right);
        }
    }

    public void update (int index, int data){
        update(this.root, index, data);
    }

    private int update(Node node, int index, int data){
        if (index < node.start || index > node.end){
            return node.data;
        }

        if (index == node.start && index == node.end){
            node.data = data;
            return data;
        }

        int mid = (node.start + node.end) / 2;

        if (index > node.start){
            node.right.data = update(node.right, index, data);
        }
        if (index < node.end){
            node.left.data = update(node.left, index, data);
        }

        node.data = node.left.data + node.right.data;

        return node.data;
    }

    public int sumRange(int start, int end){
        return sumRange(this.root, start, end);
    }

    private int sumRange(Node node, int start, int end){
        if (start > node.end || end < node.start){
            return 0;
        } else if (start <= node.start && end >= node.end){
            return node.data;
        }

        return this.sumRange(node.left, start,end) + this.sumRange(node.right,start,end);
    }



    public static void main(String[] args) {
        int arr[] = {3,8,6,7,-2,-8,4,9};
//        int arr2[] = {3,8,6,5};

        SegmentTree st = new SegmentTree(arr);

//        st.display();

        System.out.println(st.sumRange(1,6));
//
//        st.update(3, 5);
//        System.out.println("--------------------------------------------------");
//
//        st.display();

    }
}
