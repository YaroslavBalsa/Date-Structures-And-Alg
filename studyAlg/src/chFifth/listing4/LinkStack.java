package chFifth.listing4;

public class LinkStack {
    private LinkList theList;

    public LinkStack() {
        theList = new LinkList();
    }
    public void push(long data) {
        theList.insert(data);
    }
    public long pop() {
        return theList.delete();
    }
    public boolean isEmpty() {
        return (theList.isEmpty());
    }
    public void displayStack() {
        System.out.print("Stack (top -> bottom): ");
        theList.displayList();
    }
}
