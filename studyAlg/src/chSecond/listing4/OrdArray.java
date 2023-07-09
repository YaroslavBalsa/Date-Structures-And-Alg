package chSecond.listing4;

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
    public int find(long searchKey){
        int lowerB = 0;
        int upperB = nElems - 1;
        int curln;

        while (true){
            curln = (lowerB + upperB) / 2;
            if(a[curln] == searchKey){
                return curln;
            } else if (lowerB > upperB){
                return nElems;
            } else {
                if(a[curln] < searchKey){
                    lowerB = curln + 1;
                } else {
                    upperB = curln - 1;
                }
            }
        }
    }
    public void insert(long value){
        int i;
        for( i = 0; i < nElems; i++){
            if(a[i] > value){
                break;
            }
        }
        for (int k = nElems; k > i; k--){
            a[k] = a[k - 1];
        }
        a[i] = value;
        nElems++;
    }
    public boolean delete(long value){
        int i = find(value);
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
