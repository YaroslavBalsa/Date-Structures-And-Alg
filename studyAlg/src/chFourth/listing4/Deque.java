package chFourth.listing4;


public class Deque {
    private int maxSize;
    private long [] arrayDeque;
    private int frontL;
    private int frontR;
    private int rearL;
    private int rearR;
    private int quantityElements;

    public Deque(int maxSize) {
        this.maxSize = maxSize;
        arrayDeque = new long[maxSize];
        frontL = 0;
        frontR = maxSize - 1;
        rearL = -1;
        rearR = maxSize;
        quantityElements = 0;
    }
    public void insertLeft(int element){

        if (isFull()){
            throw new UnsupportedOperationException("Queue is full !");
        }

        if (rearL == (maxSize - 1) || rearL == rearR){
            rearL = -1;
        }

        arrayDeque[++rearL] = element;
        quantityElements++;
    }
    public void insertRight(int element){

        if (isFull()){
            throw new UnsupportedOperationException("Queue is full !");
        }

        if (rearR == 0 || rearR == rearL){
            rearR = (maxSize);
        }

        arrayDeque[--rearR] = element;
        quantityElements++;
    }
    public long removeLeft() {
        if (isEmpty()){
            throw new UnsupportedOperationException("Queue is empty !");
        }

        long temp = arrayDeque[frontL++];

        if (frontL == maxSize){
            frontL = 0;
        }

        quantityElements--;
        return temp;
    }
    public long removeRight() {
        if (isEmpty()){
            throw new UnsupportedOperationException("Queue is empty !");
        }

        long temp = arrayDeque[frontR--];

        if (frontR == 0){
            frontR = maxSize - 1;
        }

        quantityElements--;
        return temp;
    }
    public boolean isFull(){
        return quantityElements == maxSize;
    }
    public boolean isEmpty(){
        return quantityElements == 0;
    }
    public void printDeque(){
        if (isEmpty()){
            throw new UnsupportedOperationException("The queue is empty !");
        }

//        for (long e : arrayDeque){
//            System.out.print(e + " ");
//        }

//        while (!isEmpty()){
//            for (int i = 0; i < arrayDeque.length; i++){
//                System.out.print(arrayDeque[i] + " ");
//            }
//        }
        System.out.println("");
    }
}
