package chSecond.listing3;

public class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max) {
        a = new long[max];
        nElems = 0;
    }
    public boolean find(long searchKey){
        int i;
        for(i = 0; i < nElems; i++){
            if(a[i] == searchKey){
                break;
            }
        }
        if(i == nElems){
            return false;
        } else {
            return true;
        }
    }
    public void insert (long value){
        a[nElems] = value;
        nElems++;
    }
    public boolean delete (long value){
        int i;
        for(i = 0; i < nElems; i++){
            if(value == a[i]){
                break;
            }
        }
        if(i == nElems){
            return false;
        } else {
            for(int k = i; k < nElems; k++){
                a[k] = a[k + 1];
            }
            nElems--;
            return true;
        }
    }
    public void display(){
        for(int i = 0; i < nElems; i++){
            System.out.print(a[i] + " ");
//            System.out.println("");
        }
    }
}
