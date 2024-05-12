package com.learning.java.dsa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
class Node {
    private int val;
    private Node left;
    private Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Tree {
    public static void main(String[] args) {
        Node root = new Node(0);
        root.setLeft(new Node(1));
        root.setRight(new Node(2));
        root.getLeft().setLeft(new Node(3));
        preorder(root);
    }

    private static void preorder(Node root) {
        if (Objects.isNull(root))
            return;
        preorder(root.getLeft());
        System.out.println(root.getVal());
        preorder(root.getRight());
    }
}
