package chFifth.listing8;

public class AppDoublyLinked {
    public static void main(String[] args) {
        DoublyLinked doublyLinked = new DoublyLinked();

        doublyLinked.insertFirst(22);
        doublyLinked.insertFirst(44);
        doublyLinked.insertFirst(66);

        doublyLinked.insertLast(11);
        doublyLinked.insertLast(33);
        doublyLinked.insertLast(55);

        doublyLinked.displayForward();
        doublyLinked.displayBackward();

        doublyLinked.removeFirst();
        doublyLinked.removeLast();
        doublyLinked.removeKey(11);

        doublyLinked.displayForward();

        doublyLinked.insertAfter(22, 77);
        doublyLinked.insertAfter(33, 88);

        doublyLinked.displayForward();
    }
}
