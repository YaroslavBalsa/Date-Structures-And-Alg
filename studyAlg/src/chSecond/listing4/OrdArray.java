package chSecond.listing4;

import java.lang.reflect.Array;

public class OrdArray {
    private long[] a;
    private int nElems;

    public OrdArray(int max) {
        a = new long[max];
        nElems = 0;
    }
    public int size(){
        return nElems;
    }
    public int binarySearch(long value){
        int lowerB = 0;
        int upperB = nElems - 1;
        int curln;

        while (true){
            curln = (lowerB + upperB) / 2;
            if(a[curln] == value){
                return curln;
            } else if (lowerB > upperB){
                return nElems;
            } else {
                if(a[curln] < value){
                    lowerB = curln + 1;
                } else {
                    upperB = curln - 1;
                }
            }
        }
    }
    public int find(long searchKey){
        return binarySearch(searchKey);
    }
    public void insert(long value){
        int lowerB = 0;
        int upperB = nElems - 1;
        int curln;

        while(true) {

            curln = (lowerB + upperB) / 2;
            if (a[curln] == value) {
                break;
            } else if (lowerB > upperB) {
                if (a[curln] <= value) {
                    if (a[curln] == 0 && nElems == 0){
                        curln = 0;
                    } else {
                        curln++;
                    }
                }
                break;
            } else {
                if (a[curln] > value){
                    upperB = curln - 1;
                } else {
                    lowerB = curln + 1;
                }
            }
        }

        for (int k = nElems; k > curln; k-- ){
            a[k] = a[k -1];
        }
        a[curln] = value;
        nElems++;
    }

    public boolean delete(long value){
        int i = binarySearch(value);
        if(i == nElems){
            return false;
        } else {
            for (int k = i; k < nElems; k++){
                a[k] = a[k + 1];
            }
            nElems--;
        }
        return true;
    }
    public void display(){
        for(int i = 0; i < nElems; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
