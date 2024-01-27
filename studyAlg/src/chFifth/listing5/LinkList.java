package chFifth.listing5;

import chFifth.listing4.Link;

public class LinkList {
    private Link first;
    private Link last;
    public LinkList() {
        first = null;
        last = null;
    }
    public boolean isEmpty() {
        return (first == null);
    }
    public void insert(long data) {
        Link newLink = new Link(data);
        newLink.setData(data);

        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }

        last = newLink;
    }
    public long delete() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("Linked list is empty!");
        }

        long temp = first.getData();

        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
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
