package chFifth.listing5;

public class LinkQueue {
    private LinkList linkList;
    public LinkQueue() {
        linkList = new LinkList();
    }
    public boolean isEmpty() {
        return linkList.isEmpty();
    }
    public void insert(long data) {
        linkList.insert(data);
    }
    public long remove() {
       return linkList.delete();
    }
    public void displayQueue() {
        System.out.println("Queue (front -> rear): ");
        linkList.displayList();
    }
}
