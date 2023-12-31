package chFourth.listing6;

public class PriorityQApp {
    public static void main(String[] args) {
        PriorityQ queue = new PriorityQ(5);

        queue.insert(30);
        queue.insert(50);
        queue.insert(10);
        queue.insert(40);
        queue.insert(20);

        while (!queue.isEmpty()){
            long element = queue.priorityRemove();
            System.out.println(element + " ");
        }
        System.out.println("");
    }
}
