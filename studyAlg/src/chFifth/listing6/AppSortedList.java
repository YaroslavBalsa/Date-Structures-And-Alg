package chFifth.listing6;

public class AppSortedList {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();

        sortedList.insert(20);
        sortedList.insert(40);
        sortedList.displayList();

        sortedList.insert(10);
        sortedList.insert(30);
        sortedList.insert(50);
        sortedList.displayList();

        sortedList.delete();

        sortedList.displayList();
    }
}
