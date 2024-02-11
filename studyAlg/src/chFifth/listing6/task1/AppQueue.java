package chFifth.listing6.task1;

public class AppQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.insert(60);
        queue.insert(20);
        queue.insert(70);
        queue.insert(40);

        queue.remove();

        queue.displayQueue();
    }
}
