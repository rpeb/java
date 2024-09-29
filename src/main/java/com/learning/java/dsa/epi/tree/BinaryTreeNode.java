package com.learning.java.dsa.epi.tree;

public class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode<T> left, right;

    public BinaryTreeNode(T data) {
        this(data, null, null);
    }

    public BinaryTreeNode(T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
