package com.learning.java.dsa.carrano.ch1;

import java.util.Arrays;

public class Bag<T> implements BagInterface<T> {
	
  private T[] elements = (T[]) new Object[0];
  private int size = 0;

  @Override
	public boolean add(final T newEntry) {
    if (size == elements.length) {
      resize();
    }
    elements[size++] = newEntry;
    return true;
	}

	@Override
	public boolean contains(final T anEntry) {
    for (int i = 0; i < size; ++i) {
      if (elements[i] == anEntry) {
        return true;
      }
    }
    return false;
	}

	@Override
	public int getCurrentSize() {
		return size;
	}

	@Override
	public int getFrequencyOf(final T anEntry) {
		int freq = 0;
    for (int i = 0; i < size; ++i) {
      freq += elements[i] == anEntry ? 1 : 0;
    }
    return freq;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public T remove() {
		T removedElement = elements[0];
    for (int i = 1; i < size; ++i) {
      elements[i-1] = elements[i];
    }
    size--;
    return removedElement;
    // removes first element of the array
	}

	@Override
	public T[] toArray() {
		return Arrays.copyOf(elements, size);
	}

	@Override
	public boolean remove(T anEntry) {
    int i = 0;
    while (i < elements.length) {
      if (elements[i] == anEntry) {
        break;
      }
    }
    if (i == elements.length) { 
      return false; 
    }
    // [1,2,3,4,5,6] 
    for (int k = i + 1; k < size; ++k) {
      elements[k-1] = elements[k];
    }
    size--;
    return true;
	}

	@Override
	public void clear() {
    Arrays.fill(elements, 0, size, null);
    size = 0;
	}

  private void resize() {
    int newCapacity = elements.length * 2;
    elements = Arrays.copyOf(elements, newCapacity);
  }
  
}
