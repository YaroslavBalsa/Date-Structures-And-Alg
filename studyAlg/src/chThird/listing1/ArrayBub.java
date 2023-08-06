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
    public void alternativesBubbleSort(){
        int inner, rightOuter, leftOuter;

        for (rightOuter = nElem - 1; rightOuter > 1; rightOuter--){
            for (inner = 0; inner < rightOuter; inner++){
                if (a[inner] > a[inner + 1]){
                    long temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        } for (leftOuter = 0; leftOuter < nElem - 1; leftOuter++){
            for (inner = nElem - 1; inner > leftOuter; inner--){
                if (a[inner] < a[inner - 1]){
                    long temp = a[inner];
                    a[inner] = a[inner - 1];
                    a[inner - 1] = temp;
                }
            }
        }
    }
}
