package BinaryTreesDSA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.insert(scanner);
//        tree.prettyDisplay();

        BST tree = new BST();
//        int[] arr = {15, 15, 9, 21, 76, 4, 5, 6, 7};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        tree.populateSorted(arr2);
//        tree.display();
        tree.preOrder();
        tree.inorder();
        tree.postOrder();
    }
}
