package chFifth.listing7;

import chFifth.listing4.Link;

public class SortedList {
    private Link first;

    public SortedList() {
        this.first = null;
    }
    public SortedList(Link [] arr){
        first = null;
        for (int i = 0; i < arr.length; i++ ){
            insert(arr[i]);
        }
    }
    public void insert(Link key) {

        Link newLink = new Link(key.getData());
        Link previous = null;
        Link current = first;

        while (current != null && key.getData() > current.getData()) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            first = newLink;
        } else {
            previous.next = newLink;
        }

        newLink.next = current;
    }
    public boolean isEmpty() {
        return (first == null);
    }
    public Link remove() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("The list is empty!");
        }

        Link temp = first;
        first = first.next;
        return temp;
    }
}
