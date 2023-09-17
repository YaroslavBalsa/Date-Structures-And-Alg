package chFourth.listing5;

public class Queue {
    private int maxSize;
    private long [] queArr;
    private int front;
    private int rear;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queArr = new long[maxSize];
        rear = -1;
        front = 0;
    }
    public void insert (long i){

        if (isFull()){
            throw new UnsupportedOperationException("Queue is full !");
        }

        if (rear == maxSize - 1){
            rear = -1;
        }

        queArr[++rear] = i;
    }
    public long remove (){

        if (isEmpty()){
            throw new UnsupportedOperationException("Queue is empty !");
        }

        long temp = queArr[front];

        if (front == maxSize){
            front = 0;
        }

        return temp;
    }
    public long peek (){
        return queArr[front];
    }
    public boolean isEmpty (){
        return (rear + 1 == front || (front + maxSize - 1 == rear));
    }
    public boolean isFull (){
        return (rear + 2 == front || (front + maxSize - 2 == rear));
    }
}
