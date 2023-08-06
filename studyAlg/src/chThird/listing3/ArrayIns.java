package chThird.listing3;

public class ArrayIns {
    private long a[];
    private int nElem;

    public ArrayIns(int max) {
        a = new long[max];
        nElem = 0;
    }
    public void insert(int value){
        a[nElem] = value;
        nElem++;
    }
    public void display(){
        for (int i = 0; i < nElem; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    public void insertionSort(){
        int out, in;

        for (out = 1; out < nElem; out++){
            long temp = a[out];
            in = out;

            while (in > 0 && a[in - 1] >= temp){
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }
    public int getMedian(){
        insertionSort();

        int median = nElem / 2;
        System.out.println(a[median]);
        return (int) a[median];
    }
}
