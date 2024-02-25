package chFifth.task3;

import chFifth.listing3.Link;

public class CycleLinkedList {
    Node current;
    Node head;
    private int amount = 0;

    public CycleLinkedList() {
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            current = newNode;
            head = newNode;
        } else {
            newNode.next = current;
            current = newNode;
            head.next = current;
        }
        amount++;
    }
    public Node step() {
        if (current != null) {
            return (current = current.next);
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return (current == null);
    }

    public int getAmount() {
        return amount;
    }

    public void printList() {
        for (int i = amount; i > 0; i--){
            current.printNode();
            current = current.next;
        }
    }
}
