package com.learning.java.collections;

import com.learning.java.model.User;
import lombok.*;

import java.util.Iterator;

class MyList<T> implements Iterable<T> {
    private int count;
    private int index;
    private int max;
    private T[] array = (T[]) new Object[max];
    public MyList(int max) {
        this.index = 0;
        this.max = max;
    }
    public void add(T element) {
        if (count == max)
            throw new ArrayIndexOutOfBoundsException("out of bound!");
        array[count++] = element;
    }

    public int size() {
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyListIterator();
    }

    private class MyListIterator implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return index < count;
        }

        @Override
        public T next() {
            return array[index++];
        }
    }
}

public class IterableDemo {
    public static void main(String[] args) {
        MyList<User> users = new MyList<>(10);
        users.add(new User("a", 1));
        users.add(new User("b", 1));
        users.add(new User("a", 2));
        users.add(new User("a", 3));
        System.out.println(users.size());
        for (User user : users) {
            System.out.println(user);
        }
    }
}

