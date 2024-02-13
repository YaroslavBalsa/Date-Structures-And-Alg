package chFifth.listing8.task2;

public class AppDeque {
    public static void main(String[] args) {
        Deque deque = new Deque();

        deque.insertFirst(10);
        deque.insertLast(20);
        deque.insertFirst(30);
        deque.insertFirst(40);

        deque.printDeque();

        deque.removeLast();
        deque.removeLast();

        deque.printDeque();
    }
}
