package chFifth.listing9;

import chFifth.listing8.Link;

public class LinkList {
    private Link first;

    public LinkList() {
        this.first = null;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }
    public boolean isEmpty() {
        return (first == null);
    }
    public IteratorList getIterator() {
        return new IteratorList(this);
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
