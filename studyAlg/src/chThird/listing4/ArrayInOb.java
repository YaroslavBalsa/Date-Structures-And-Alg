package chThird.listing4;

public class ArrayInOb {
    private Person a[];
    private int nElem;

    public ArrayInOb(int max) {
        a = new Person[max];
        nElem = 0;
    }
    public void insert(Person value){
        a[nElem] = value;
        nElem++;
    }
    public void display(){
        for (int i = 0; i < nElem; i++){
            a[i].displayPerson();
        }
        System.out.println();
    }
    public void insertionSort(){
        int out, in;

        for (out = 1; out < nElem; out++){
            Person temp = a[out];
            in = out;

            while (in > 0 && a[in - 1].getLastName().compareTo(temp.getLastName()) > 0){
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }
}
