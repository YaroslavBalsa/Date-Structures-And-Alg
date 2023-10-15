package chFourth.listing6;

public class PriorityQ {
    private long [] priorityQArray;
    private int nElem;
    private int maxSize;

    public PriorityQ(int maxSize) {
        this.maxSize = maxSize;
        priorityQArray = new long[maxSize];
        nElem = 0;
    }
//    public void insert (long element){
//
//        int i;
//
//        if (nElem == 0){
//            priorityQArray[nElem++] = element;
//        } else {
//            for (i = nElem - 1; i >= 0; i--){
//                if (element > priorityQArray[i]){
//                    priorityQArray[i + 1] = priorityQArray[i];
//                } else {
//                    break;
//                }
//            }
//            priorityQArray[i + 1] = element;
//            nElem++;
//        }
//    }

//    public long remove (){
//        return priorityQArray[--nElem];
//    }
    public void insert (long element){
        priorityQArray[nElem] = element;

        nElem++;
    }
    public long priorityRemove (){

        int i;
        long element = priorityQArray[nElem - 1] ;


        if (isEmpty()){
            throw new UnsupportedOperationException("Queue is already empty ! ");
        } else {
            for (i = 0; i < nElem - 1; i++){
                if (element > priorityQArray[i]){
                    long temp = element;
                    element = priorityQArray[i];
                    priorityQArray[i] = temp;
                }
            }
            nElem--;
        }
        return element;
    }
    public long peekMIn (){
        return priorityQArray[nElem - 1];
    }
    public boolean isEmpty (){
        return (nElem == 0);
    }
    public boolean isFull (){
        return (nElem == maxSize);
    }
}
