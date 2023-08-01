package chThird.listing2;

public class ArraySel {
    private long a[];
    private int nElem;

    public ArraySel(int max) {
        a = new long[max];
        nElem = 0;
    }
    public void insert(int value){
        a[nElem] = value;
        nElem++;
    }
    public void display (){
        for (int i = 0; i < nElem; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    public void selectSort(){
        int out, in, min;

        for(out = 0; out < nElem - 1; out++){
            min = out;
            for(in = out + 1; in < nElem; in++){
                if(a[in] < a[min]){
                    min = in;
                }
                long temp = a[out];
                a[out] = a[min];
                a[min] = temp;
            }
        }
    }
}
