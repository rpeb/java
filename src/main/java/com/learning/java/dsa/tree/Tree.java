package com.learning.java.dsa.tree;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
class Node1 {
	private int val;
	private Node1 left;
	private Node1 right;

	Node1(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class Tree {
	
	public static void main(String[] args) {
		Node1 root = new Node1(0);
		root.setLeft(new Node1(1));
		root.setRight(new Node1(2));
		root.getLeft().setLeft(new Node1(3));
		preorder(root);
	}

	private static void preorder(Node1 root) {
		if (Objects.isNull(root))
			return;
		preorder(root.getLeft());
		System.out.println(root.getVal());
		preorder(root.getRight());
	}
}
