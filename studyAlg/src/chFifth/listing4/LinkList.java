package chFifth.listing4;

public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }
    public boolean isEmpty() {
        return (first == null);
    }
    public void insert(long date) {
        Link newLink = new Link(date);
        newLink.setData(date);

        if (isEmpty()) {
            first = newLink;
        } else {
            newLink.next = first;
            first = newLink;
        }
    }
    public long delete() {
        Link temp = first;
        if (!isEmpty()) {
            first = first.next;
        } else {
            System.out.println("Linked list не имеет удаляемое колличество эллементов!");
        }
        return temp.getData();
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
