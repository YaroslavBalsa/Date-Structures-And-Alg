package chFifth.listing5;

public class AppLinkQueue {
    public static void main(String[] args) {
        LinkQueue queue = new LinkQueue();

        queue.insert(20);
        queue.insert(40);
        queue.displayQueue();

        queue.insert(60);
        queue.insert(80);
        queue.displayQueue();

        queue.remove();
        queue.remove();
        queue.displayQueue();
    }
}
