package chFifth.task3;

public class AppNode {
    public static void main(String[] args) {
        CycleLinkedList list = new CycleLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);


        list.printList();
    }
}
