package BinaryTreesDSA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.insert(scanner);
        tree.prettyDisplay();
    }
}
