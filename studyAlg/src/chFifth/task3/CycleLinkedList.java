package chFifth.task3;

import chFifth.task4.Person;

public class CycleLinkedList<T> {
    Node <T> current;
    Node <T> head;
    private int amount = 0;

    public static class Node<T> {
        private T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
        public void printNode() {
            System.out.println(data.toString() + " ");
        }
    }


    public CycleLinkedList() {
    }

    public void insert(Person person) {
//        Person person = new Person(st, i);

        Node newNode = new Node<Person> (person);

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

