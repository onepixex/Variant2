package org.example;

public class List {
    protected int[] array;
    protected int size;

    public List(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    public void insert(int element) {
        if (size == array.length) {
            int[] newArray = new int[size * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = element;
    }

    public int remove(int index) {
        int removedElement = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
        return removedElement;
    }

    public int get(int index) {
        return array[index];
    }

}
