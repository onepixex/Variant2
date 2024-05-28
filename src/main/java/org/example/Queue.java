package org.example;

public class Queue extends List {

    public Queue(int capacity) {
        super(capacity);
    }

    public void enqueue(int element) {
        insert(element);
    }

    public int dequeue() {
        return remove(0);
    }

    public int peek() {
        return get(0);
    }
}

