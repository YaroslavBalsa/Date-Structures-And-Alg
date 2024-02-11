package chFifth.listing9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterIterator {
    public static void main(String[] args) throws IOException {
        LinkList list = new LinkList();
        IteratorList iterator = list.getIterator();
        long value;

        iterator.insertAfter(20);
        iterator.insertAfter(40);
        iterator.insertAfter(80);
        iterator.insertAfter(60);

        while (true) {
            System.out.flush();

            System.out.print("Enter first letter of show, reset, " +
                    "next, get, before, after, delete: ");

            int choice = getChar();

            switch (choice) {
                case 's':
                    if (!list.isEmpty()){
                        list.displayList();
                    } else {
                        System.out.println("Sorry, list is empty:(");
                    }
                    break;
                case 'r':
                    iterator.reset();
                    break;
                case 'n':
                    if (!list.isEmpty() && !iterator.atEnd()) {
                        iterator.next();
                    } else {
                        System.out.println("Can`t go to the next element");
                    }
                    break;
                case 'g':
                    if (!list.isEmpty()) {
                        value = iterator.getCurrent().getData();
                        System.out.println("Returned " + value);
                    } else {
                        System.out.println("Sorry, list is empty:(");
                    }
                    break;
                case 'b':
                    System.out.println("Enter value to insert: ");
                    System.out.flush();
                    value = getInt();

                    iterator.insertBefore(value);
                    break;
                case 'a':
                    System.out.println("Enter value to insert: ");
                    System.out.flush();
                    value = getInt();

                    iterator.insertAfter(value);
                    break;
                case 'd':
                    if (!list.isEmpty()) {
                        value = iterator.deleteCurrent();
                        System.out.println("Removed " + value);
                    } else {
                        System.out.println("Can`t remove");
                        break;
                    }
                default:
                    System.out.println("Invalid entry");
            }
        }
    }

    private static int getInt() throws IOException {
        String string = getString();
        return Integer.parseInt(string);
    }

    private static char getChar() throws IOException {
        String string = getString();
        return string.charAt(0);
    }

    public static String getString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        return string;
    }
}
