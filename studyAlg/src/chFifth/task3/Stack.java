package chFifth.task3;

import chFifth.task4.Person;

public class Stack<T> {
    private final CycleLinkedList<T> stack;
    private T data;

    public Stack(CycleLinkedList<T> stack) {
        this.stack = new CycleLinkedList<>();
    }
    public void push(T data) {
        stack.insert(data);
    }
    public T pop() {
        return stack.remove();
    }
    public T peek() {
        return stack.current.getData();
    }
    public void printStack() {
        stack.printList();
    }
}
