package chSecond.listing3;

public class HighArrayApp {
    public static void main(String[] args) {
        HighArray arr = new HighArray(100);

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

        arr.insert(77);
        arr.insert(33);
        arr.insert(66);
        arr.insert(22);

        arr.display();

        arr.noDups();
        arr.display();

        int searchKey = 88;
        if(arr.find(searchKey)){
            System.out.print("Found " + searchKey);
        } else {
            System.out.print("Can`t find " + searchKey);
        }
        System.out.println("");

        arr.getMax();

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();

        arr.removeMax();

        arr.display();

        arrSort(arr);
    }
    private static long[] arrSort (HighArray arr){

        long[] arrSort = new long [arr.size()];

        for (int i = arr.size(); i > 0; i--){
           arrSort[i - 1] = arr.removeMax();
        }
        System.out.println("");
        return arrSort;
    }
}
