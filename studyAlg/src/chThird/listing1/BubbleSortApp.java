package chThird.listing1;

public class BubbleSortApp {
    public static void main(String[] args) {
        ArrayBub arr = new ArrayBub(100);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        arr.oddEvenSort();
//        arr.bubbleSort();
        arr.display();

//        arr.alternativesBubbleSort();
//        arr.display();
    }
}
