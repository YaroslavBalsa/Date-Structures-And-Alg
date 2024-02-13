package chFifth.listing8.task2;

import chFifth.listing8.DoublyLinked;

public class Deque {
    DoublyLinked linkedList;
    int elements;
    public Deque() {
        linkedList = new DoublyLinked();
    }
    public boolean isEmpty() {
        return (elements == 0);
    }
    public void insertFirst(long data) {
        linkedList.insertFirst(data);
        elements++;
    }
    public void insertLast(long data) {
        linkedList.insertLast(data);
        elements++;
    }
    public long removeFirst() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("Queue is already empty!");
        }

        long data = linkedList.removeFirst().getData();
        elements--;

        return data;
    }
    public long removeLast() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("Queue is already empty!");
        }

        long data = linkedList.removeLast().getData();
        elements--;

        return data;
    }
    public void printDeque() {
        linkedList.displayForward();
    }
}
