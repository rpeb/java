package com.learning.java.dsa.epi.tree;

public class TreeUtil {
    public static BinaryTreeNode<Integer> getTree() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(314); // A
        root.left = new BinaryTreeNode<>(6); // B
        root.left.left = new BinaryTreeNode<>(271); // C
        root.left.left.left = new BinaryTreeNode<>(28); // D
        root.left.left.right = new BinaryTreeNode<>(0); // E
        root.left.right = new BinaryTreeNode<>(561); // F
        root.left.right.right = new BinaryTreeNode<>(3); // G
        root.left.right.left = new BinaryTreeNode<>(17); // H
        root.right = new BinaryTreeNode<>(6); // I
        root.right.left = new BinaryTreeNode<>(2); // J
        root.right.left.right = new BinaryTreeNode<>(1); // K
        root.right.left.right.left = new BinaryTreeNode<>(401); // L
        root.right.left.right.left.right = new BinaryTreeNode<>(641); // M
        root.right.left.right.right = new BinaryTreeNode<>(257); // N
        root.right.right = new BinaryTreeNode<>(271); // O
        root.right.right.right = new BinaryTreeNode<>(28); // P
        return root;
    }

    public static int getDepth(int data, BinaryTreeNode<Integer> tree, int depth) {
        if (tree == null)
            return -1;
        if (tree.data == data)
            return depth;
        return Math.max(getDepth(data, tree.left, depth + 1), getDepth(data, tree.right, depth + 1));
    }
}
