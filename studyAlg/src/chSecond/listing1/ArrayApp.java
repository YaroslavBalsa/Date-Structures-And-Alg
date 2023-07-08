package chSecond.listing1;

public class ArrayApp {
    public static void main(String[] args) {
        int [] arr = new int [100];
        int nElms = 0;
        int searchKey;
        int i;

        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 0;
        arr[8] = 66;
        arr[9] = 33;
        nElms = 10;

        for (i = 0; i < nElms; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("--->");

        searchKey = 66;
        for (i = 0; i < nElms; i++){
            if (arr[i] == searchKey){
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
            if (arr[i] == searchKey){
                break;
            }
        }
        for (int k = i; k < nElms - 1; k++){
            arr[k] = arr[k + 1];
        }
        nElms --;

        for (i = 0; i < nElms; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
