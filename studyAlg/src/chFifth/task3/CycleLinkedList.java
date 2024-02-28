package chFifth.task3;

public class CycleLinkedList<T> {
    Node<T> current;
    Node<T> head;
    private int amount;

    public static class Node<T> {
        private final T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
        public void printNode() {
            System.out.println(data.toString());
        }
    }

    public CycleLinkedList() {
        this.amount = 0;
    }

    public void insert(T data) {

        Node<T> newNode = new Node<>(data);

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
    public T remove() {
        Node <T> temp = current;

        if (amount == 1) {
            step();
            current = null;
            head = null;
        } else {
            step();
            head.next = current;
        }
        amount--;

        return temp.getData();
    }

    public Node<T> step() {
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
            step();
        }
        System.out.println("");
    }

    public Node<T> getCurrent() {
        return current;
    }
}

