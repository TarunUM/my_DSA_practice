package BinaryTreesDSA;

public class BST {
    Node root;
    public BST(){}

    void insert(int data){
        this.root = insert(data, this.root);
    }

    Node insert(int data, Node root){
        if (root == null){
            return new Node(data);
        } else {
            if (root.data < data){
                root.right = insert(data, root.right);
            } else {
                root.left = insert(data, root.left);
            }
        }

        root.height = Math.max(height(root.left), height(root.right)) + 1;

        return root;
    }

    public boolean isBalanced(){
        return balance(this.root);
    }

    private boolean balance(Node root){
        if (root == null){
            return true;
        }
        return balance(root.left) && balance(root.right) && Math.abs(height(root.left) - height(root.right)) <= 1;
    }


    public int height(Node root){
        if (root == null){
            return 0;
        }
        return root.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(this.root, "Root Node ");
    }

    void display(Node root, String details){
        if (root == null){
            return;
        }
        System.out.println(root.data + " " + details);
        display(root.left, "Left Node of " + root.data);
        display(root.right, "Right Node of " + root.data);
    }

    void populate(int[] arr){
        for (int j : arr) {
            insert(j);
        }
    }

    void populateSorted(int[] arr){
        populateSorted(arr, 0, arr.length-1);
    }

    void inorder(){
        inorder(this.root);
        System.out.println();
    }

    void preOrder(){
        preOrder(this.root);
        System.out.println();
    }

    void postOrder(){
        postOrder(this.root);
        System.out.println();
    }

    private void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " - ");
        inorder(root.right);
    }

    private void preOrder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data + " - ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private void postOrder(Node root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " - ");
    }



    private void populateSorted(int[] arr, int start, int end){
        if (start > end){
            return;
        }
        int mid = start + (end - start)/2;
        insert(arr[mid]);
        populateSorted(arr, start, mid-1);
        populateSorted(arr, mid+1, end);
    }

    private static class Node{
        int data;
        Node left;
        Node right;
        int height;
        public Node(int data){
            this.data = data;
        }
    }
}
