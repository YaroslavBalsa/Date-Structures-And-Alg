package chFifth.listing6.task1;

import chFifth.listing6.SortedList;

public class Queue {
    private SortedList sortQueue;

    public Queue() {
        sortQueue = new SortedList();
    }
    public void insert(long data) {
        sortQueue.insert(data);
    }
    public long remove() {
        long removed = sortQueue.delete();

        return removed;
    }
    public void displayQueue() {
        sortQueue.displayList();
    }
}
