package chFifth.task3;

import chFifth.task4.Person;
import chFifth.task4.Stack;

public class AppNode {
    public static void main(String[] args) {
        CycleLinkedList<Person> list = new CycleLinkedList<>();

        Stack<Person> stack = new Stack<>(list);

        stack.push(new Person(11,"Jonny", 45));
        stack.push(new Person(55,"Mike", 29));
        stack.push(new Person(33,"Bobby", 32));
        stack.push(new Person(22,"Lenny", 30));
        stack.push(new Person(44,"Toby", 61));

        stack.printStack();

        stack.pop();
        stack.pop();

        stack.printStack();
    }
}
