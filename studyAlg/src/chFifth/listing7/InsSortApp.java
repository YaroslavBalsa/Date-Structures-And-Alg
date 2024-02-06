package chFifth.listing7;

import chFifth.listing4.Link;

public class InsSortApp {
    public static void main(String[] args) {
        int size = 10;

        Link[] arr = new Link[size];

        for (int i = 0; i < size; i++){
            int n = (int)(java.lang.Math.random()*99);
            Link newLink = new Link(n);

            arr[i] = newLink;
        }

        System.out.print("Unsorted array: ");
        for (int i = 0; i < size; i++){
            System.out.print(arr[i].getData() + " ");
        }

        System.out.println("");

        SortedList theSort = new SortedList(arr);

        for (int i = 0; i < size; i++){
            arr[i] = theSort.remove();
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++){
            System.out.print(arr[i].getData() + " ");
        }
        System.out.println("");
    }
}
