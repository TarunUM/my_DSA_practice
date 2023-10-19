package BinaryTreesDSA;

public class AVLTree {
    Node root;
    public AVLTree(){}

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

        return rotate(root);
    }

    private Node rotate(Node node){
        if (height(node.left) - height(node.right) > 1){
            if (height(node.left.left) < height(node.left.right)){
                node.left = leftRotate(node.left);
            }
            return rightRotate(node);
        }
        if (height(node.right) - height(node.left) > 1){
            if (height(node.right.right) < height(node.right.left)){
                node.right = rightRotate(node.right);
            }
            return leftRotate(node);
        }
        return node;
    }

    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    private Node leftRotate(Node p){
        Node c = p.right;
        Node t = c.left;

        c.left = p;
        p.right = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
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

    public int height() {
        return height(root);
    }

    public int height(Node root){
        if (root == null){
            return -1;
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

    void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    void prettyDisplay(Node root, int level){
        if (root == null){
            return;
        }

        prettyDisplay(root.right, level + 1);

        if (level != 0){
            for (int i = 0; i < level - 1; i++){
                System.out.print("|\t");
            }
            System.out.println("|--->"+root.data);
        } else {
            System.out.println(root.data);
        }

        prettyDisplay(root.left, level + 1);
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

