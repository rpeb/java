package com.learning.java.dsa.tree;

import lombok.Data;

/**
 * AvlTree
 */

@Data
class Node<T extends Comparable<T>> {
  private Integer value;
  private Integer height;
  private Node<T> leftChild;
  private Node<T> rightChild;
}

public class AvlTree {
  public static void main(String[] args) {
    Node<Integer> node = new Node<>();
    node.setValue(1);
    System.out.println(node.getValue());
  }
}
