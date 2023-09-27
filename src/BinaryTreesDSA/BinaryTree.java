package BinaryTreesDSA;

import java.util.Scanner;

public class BinaryTree {
    private Node root;

    public BinaryTree(){

    }

    //Insert Elements
    void insert(Scanner sc){
        System.out.println("Enter the root value");
        int data = sc.nextInt();
        root = new Node(data);
        insert(sc, root);
    }

    void insert(Scanner sc, Node root){
        System.out.println("Do you want to insert left of " + root.data + "\n press 1 for yes and 0 for no");
        if (sc.nextInt() == 1){
            System.out.println("Enter the value of left node");
            int data = sc.nextInt();
            root.left = new Node(data);
            insert(sc, root.left);
        }

        System.out.println("Do you want to insert right " + root.data + "\n press 1 for yes and 0 for no");
        if (sc.nextInt() == 1){
            System.out.println("Enter the value of right node");
            int data = sc.nextInt();
            root.right = new Node(data);
            insert(sc, root.right);
        }
    }

    void display(){
        display(root, " ");
    }

    void display(Node root, String space){
        if (root == null){
            return;
        }
        System.out.println(space+ root.data);
        display(root.left, space + " \t");
        display(root.right, space + " \t");
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

        public Node(int data){
            this.data = data;
        }
    }
}
