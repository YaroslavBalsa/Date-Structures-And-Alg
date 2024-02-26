package chFifth.task3;

import chFifth.task4.Person;

public class AppNode {
    public static void main(String[] args) {
        CycleLinkedList<Person> list = new CycleLinkedList<>();

        list.insert(new Person("Mike", 29));
        list.insert(new Person("Jonny", 45));
        list.insert(new Person("Lenny", 30));
        list.insert(new Person("Bobby", 32));
        list.insert(new Person("Toby", 61));

        list.printList();
    }
}
