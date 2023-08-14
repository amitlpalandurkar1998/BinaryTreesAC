package com.binarytrees;

//https://www.youtube.com/watch?v=-DzowlcaUmE&list=PLfqMhTWNBTe0sPLFF91REaJQEteFZtLzA

public class Main {
    public static void preorder(Node root) { //PreOrder Traversal.
        if (root == null){
//            System.out.print("null"+" ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root) { //InOrder Traversal.
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void postorder(Node root) { //PostOrder Traversal.
        if (root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // -1 shows null.
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

//        preorder(root);
//        inorder(root);
        postorder(root);
    }
}
