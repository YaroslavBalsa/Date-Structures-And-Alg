package chSecond.listing2;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr = new LowArray(100);
        int nElms = 0;
        int searchKey;
        int i;

        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        nElms = 10;

        for (i = 0; i < nElms; i++){
            System.out.print(arr.getElem(i) + " ");
        }
        System.out.println("");
        System.out.println("--->");

        searchKey = 66;
        for (i = 0; i < nElms; i++){
            if (arr.getElem(i) == searchKey){
                break;
            }
        }
        if (i == nElms){
            System.out.println("Can`t find: " + searchKey);
        } else {
            System.out.println("Found: " + searchKey);
        }

        System.out.println("--->");

        searchKey = 55;
        for (i = 0; i < nElms; i++){
            if (arr.getElem(i) == searchKey){
                break;
            }
        }
        for (int k = i; k < nElms - 1; k++){
            arr.setElem(k, arr.getElem(k + 1));
        }
        nElms --;

        for (i = 0; i < nElms; i++){
            System.out.print(arr.getElem(i)+ " ");
        }
    }
}
