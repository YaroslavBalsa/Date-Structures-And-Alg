package chFifth.listing1;

public class LinkList {
    private Link first;

    public LinkList() {
        this.first = null;
    }

    public void insertFirst(int iDate, double dDate) {
        Link newLink = new Link(iDate, dDate);
        newLink.setiDate(iDate);
        newLink.setdData(dDate);
        newLink.next = first;

        first = newLink;
    }
    public Link find(int key) {
        Link current = first;

        while (current.getiDate() != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }
    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        while (current.getiDate() != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }
    public Link deleteFirst() {
        Link temp = null;
        if (!isEmpty()){
            temp = first;
            first = first.next;
        }
        return temp;
    }
    public boolean isEmpty() {
        return (first == null);
    }
    public void displayList() {
        System.out.print("List (first --> last): ");
        Link current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
