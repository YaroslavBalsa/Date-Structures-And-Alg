package chFifth.listing9;

import chFifth.listing8.Link;

public class IteratorList {
    private Link current;
    private Link previous;
    private LinkList ourList;

    public IteratorList(LinkList list) {
        this.ourList = list;
        reset();
    }

    public void reset() {
        current = ourList.getFirst();
        previous = null;
    }
    public boolean atEnd() {
        return (current.next == null);
    }
    public void next() {
        previous = current;
        current = current.next;
    }
    public Link getCurrent() {
        return current;
    }
    public void insertAfter(long data) {
        Link newLink = new Link(data);

        if (ourList.isEmpty()) {
            ourList.setFirst(newLink);
            current = newLink;
        } else {
            newLink.next = current.next;
            current.next = newLink;
            next();
        }
    }
    public void insertBefore(long data) {
        Link newLink = new Link(data);

        if (previous == null) {
            newLink.next = ourList.getFirst();
            ourList.setFirst(newLink);
            reset();
        } else {
            newLink.next = previous.next;
            previous.next =newLink;
            current = newLink;
        }
    }
    public long deleteCurrent() {
        long value = current.getData();

        if (previous == null) {
            ourList.setFirst(current.next);
            reset();
        } else {
            previous.next = current.next;
            if (atEnd()){
                reset();
            } else {
                current = current.next;
            }
        }
        return value;
    }
}
