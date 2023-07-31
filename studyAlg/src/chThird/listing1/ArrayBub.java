package chThird.listing1;

public class ArrayBub {
    private long a[];
    private int nElem;

    public ArrayBub(int max) {
        a = new long[max];
        nElem = 0;
    }
    public void insert(long value){
        a[nElem] = value;
        nElem++;
    }
    public void display(){
        for (int i = 0; i < nElem; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    private void swap(int one, int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
    public void bubbleSort(){
        int in;
        int out;

        for (out = nElem - 1; out > 1; out--){
            for (in = 0; in < out; in++){
                if (a[in] > a[in + 1]){
                    swap(in, in + 1);
                }
            }
        }
    }
}
