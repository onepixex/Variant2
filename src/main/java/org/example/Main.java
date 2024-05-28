package org.example;

public class Main {
    public static void main(String[] args) {
        List list = new List(3);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        System.out.println("Исходный список");
        System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));

        list.remove(1);
        System.out.println("После удаления элемента с 1 индексом");
        System.out.println(list.get(0) + " " + list.get(1));

        Stack stack = new Stack(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("Последний элемент стека");
        System.out.println(stack.peek());

        stack.pop();
        System.out.println("Стек после удаления последнего элемента");
        System.out.println(stack.peek());


        Queue queue = new Queue(3);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        System.out.println("Первый элемент очереди");
        System.out.println(queue.peek());

        queue.dequeue();
        System.out.println("После удаления первого элемента");
        System.out.println(queue.peek());

    }
}
