package chFifth.task3;

public class Node {
    private int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public int getData() {
        return data;
    }
    public void printNode() {
        System.out.print(data + " ");
    }
}
