package chFifth.listing6;
import chFifth.listing4.Link;

public class SortedList {
    private Link first;

    public SortedList() {
        this.first = null;
    }
    public void insert(long key) {
        Link newLink = new Link(key);
        Link previous = null;
        Link current = first;

        while (current != null && key > current.getData()) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            first = newLink;
        } else {
            previous.next = newLink;
        }

        newLink.next = current;
    }
    public long delete() {

        if (isEmpty()) {
            throw new UnsupportedOperationException("Linked list is empty!");
        }

        long temp = first.getData();
        first = first.next;
        return temp;
    }

    private boolean isEmpty() {
        return (first == null);
    }
    public void displayList() {
        Link current = first;

        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
