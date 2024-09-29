package com.learning.java.dsa.epi.tree;

public class HeightBalancedBinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> tree = TreeUtil.getTree();
        int depth = 0;
        System.out.println(TreeUtil.getDepth(314, tree, depth));
        System.out.println(TreeUtil.getDepth(6, tree, depth));
        System.out.println(TreeUtil.getDepth(562, tree, depth));
    }
}

