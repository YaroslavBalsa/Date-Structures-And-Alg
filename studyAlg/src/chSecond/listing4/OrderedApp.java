package chSecond.listing4;

public class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray arr = new OrdArray(maxSize);
        long[] temp = new long[]{122, 55, 66, 33, 155, 199};

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
        arr.insert(33);

        int searchKey = 55;
        if(arr.find(searchKey) != arr.size()){
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can`t find " + searchKey);
        }

        arr.display();

        arr.noDups();
        arr.display();

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();

        arr.merge(temp);

        arr.display();

        arr.noDups();
        arr.display();
    }
}
