package com.learning.java.dsa.carrano.ch1;

public class Ch1 {
  public static void main(String[] args) {
    BagInterface<Item> bag = new Bag<>();
    Item item1 = new Item("i1", 12.34);
    bag.add(item1);
    Item item2 = new Item("i2", 12.34);
    bag.add(item2);
    Item item3 = new Item("i3", 12.34);
    bag.add(item3);
    bag.add(new Item("i4", 12.34));
    System.out.println("size = " + bag.getCurrentSize());
    var result1 = bag.remove(item3);
    System.out.println("removed = " + result1);
    System.out.println("size1 = " + bag.getCurrentSize());
  }
}
