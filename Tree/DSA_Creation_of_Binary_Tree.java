package Tree;

import java.util.Scanner;

class node{
    int data;
    node left;
    node right;

    public node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class DSA_Creation_of_Binary_Tree {
    public static void main(String[] args) {
        node root = null;
        root = buildTree(root);
    }

    public static node buildTree(node root){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data");
        int data = sc.nextInt();

        if (data  == -1){
            return null;
        }

        root = new node(data);

        System.out.println("Enter the data for the left of " + data);
        root.left = buildTree(root.left);
        System.out.println("Enter the data for the right of " + data);
        root.right = buildTree(root.right);

        return root;

    }
}
