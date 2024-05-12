package com.learning.java.collections;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class LinkedListDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push("a");
        s.push(true);
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
        Queue q = new PriorityQueue((a, b) -> (int) b - (int) a);
        q.offer(1);
        q.offer(0);
        q.offer(5);
        q.offer(-1);
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
    }
}
