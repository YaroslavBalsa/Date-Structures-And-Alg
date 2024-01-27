package chFifth.listing3;

public class FirstLastList {
    private Link first;
    private Link last;
    private Link next;

    public FirstLastList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }
    public void insertFirst(long data) {
        Link newLink = new Link(data);
        newLink.setData(data);

        if (isEmpty()) {
            last = newLink;
        }

        newLink.next = first;
        first = newLink;
    }
    public void insertLast(long data) {
        Link newLink = new Link(data);
        newLink.setData(data);

        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }
    public long deleteFirst() {
        long temp = first.getData();

        if (first.next == null) {
            last = null;
        }

        first = first.next;
        return temp;
    }
    public void displayList() {
        System.out.print("List (first --> last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
