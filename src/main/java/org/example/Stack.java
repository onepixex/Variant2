package org.example;

public class Stack extends List {

    public Stack(int capacity) {
        super(capacity);
    }

    public void push(int element) {
        insert(element);
    }

    public void pop() {
        remove (size - 1);
    }

    public int peek() {
        return get(size - 1);
    }
}

