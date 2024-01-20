package chFifth.listing1;

public class LinkList {
    private Link first;

    public boolean isEmpty() {
        return (first == null);
    }
    public void insertFirst(int iDate, double dDate) {
        Link newLink = new Link(iDate, dDate);
        newLink.next = first;

        first = newLink;
    }
    public Link deleteFirst() {
        Link temp = null;
        if (!isEmpty()){
            temp = first;
            first = first.next;
        }
        return temp;
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
