package org.example;

import static org.junit.jupiter.api.Assertions.*;

class Junit5 {

    @org.junit.jupiter.api.Test
    void main() {
        List list = new List(5);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        //проверяем порядок
        assertEquals(4, list.get(0));
        assertEquals(5, list.get(1));
        assertEquals(6, list.get(2));
        //после удаления 4 - цифра 5 сдвигается на 1 месте
        list.remove(0);
        assertEquals(5, list.get(0));

        Stack stack = new Stack(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        assertEquals(6, stack.peek());
        stack.pop();
        assertEquals(5, stack.peek());

        Queue queue = new Queue(3);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        assertEquals(7, queue.peek());
        queue.dequeue();
        assertEquals(8, queue.peek());

    }
}