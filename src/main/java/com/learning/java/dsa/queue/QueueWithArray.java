package com.learning.java.dsa.queue;

public class QueueWithArray {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new Queue<>(5);
        System.out.println(integerQueue.size()); // 0
        integerQueue.enqueue(1);
        System.out.println(integerQueue.top()); // 1
        integerQueue.enqueue(2);
        integerQueue.dequeue();
        System.out.println(integerQueue.top()); // 2
        integerQueue.enqueue(3);
        System.out.println(integerQueue.size()); // 2
        integerQueue.show();
        Queue<String> stringQueue = new Queue<>(2);
        System.out.println(stringQueue.size()); // 0
        stringQueue.enqueue("1");
        stringQueue.show();
        System.out.println(stringQueue.top()); // 1
        stringQueue.enqueue("2");
        stringQueue.dequeue();
        System.out.println(stringQueue.top()); // 2
        stringQueue.enqueue("3");
        System.out.println(stringQueue.size()); // 2
        stringQueue.enqueue("4");
    }
}

class Queue<T> {
    private final T[] queue;
    private int front;
    private int rear;
    private final int maxSize;
    private int currSize;
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queue = (T[]) new Object[maxSize];
        front = -1;
        rear = -1;
        currSize = 0;
    }

    public void enqueue(T element) {
        if (currSize == maxSize) {
            throw new RuntimeException("overflow!");
        }
        if (rear == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % maxSize;
        }
        queue[rear] = element;
        currSize++;
    }
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("underflow!");
        }
        T popped = queue[front];
        if (currSize == 1) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % maxSize;
        }
        currSize--;
        return popped;
    }

    public T top() {
        if (isEmpty()) {
            throw new RuntimeException("underflow!");
        }
        return queue[front];
    }

    public int size() {
        return currSize;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        System.out.print("queue: ");
        for (int i = front; i <= rear; ++i) {
            System.out.print(queue[i] + "\t");
        }
        System.out.println();
    }

}