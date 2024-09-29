package com.learning.java.dsa.sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        Integer[] integers = {10, 55, -5, 34, 7, 22, 19};
        String[] strings = {"Rahul", "Prakash", "Sahana", "Aaditya", "Aditya"};
        Student[] students = new Student[3];
        students[0] = new Student(2,3, "second");
        students[1] = new Student(1,3, "first");
        students[2] = new Student(-1,7, "third");
        System.out.println(Arrays.toString(integers));
//        System.out.println(Arrays.toString(strings));
//        System.out.println(Arrays.toString(students));
//        new Sorter<>(strings).bubbleSort();
//        new Sorter<>(integers).bubbleSort();
//        new Sorter<>(students).bubbleSort();

//        new Sorter<>(strings).selectionSort();
        new Sorter<>(integers).selectionSort();
//        new Sorter<>(students).selectionSort();
        System.out.println(Arrays.toString(integers));
//        System.out.println(Arrays.toString(strings));
//        System.out.println(Arrays.toString(students));
    }
}

class Sorter<T extends Comparable<T>> {
    private final T[] arr;

    public Sorter(T[] arr) {this.arr = arr;}
    public void bubbleSort() {
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < arr.length - 1 - i; ++j) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    swap(arr, j, j+1);
                }
            }
            System.out.print(i + "\t");
        }
    }

    public void optimisedBubbleSort() {
        for (int i = 0; i < arr.length - 1; ++i) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; ++j) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            System.out.print(i + "\t");
            if (!swapped)
                break;
        }
    }

    public void selectionSort() {
        for (int i = 0; i < arr.length - 1; ++i) {
            swap(arr, i, getMinIndex(arr, i + 1));
        }
    }

    private int getMinIndex(T[] arr, int start) {
        T min = arr[start];
        int idx = start;
        for (int i = start; i < arr.length; ++i) {
            if (min.compareTo(arr[i]) > 0) {
                min = arr[i];
                idx = i;
            }
        }
        return idx;
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

class Student implements Comparable<Student> {

    private final int marksInMath;
    private final int marksInScience;

    private final String name;

    public Student(int a, int b, String name) {
        marksInMath = a;
        marksInScience = b;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return (this.marksInScience + this.marksInMath) - (o.marksInMath + o.marksInScience);
    }

    @Override
    public String toString() {
        return "name = " + name;
    }
}