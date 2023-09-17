package chFourth.listing4;

public class Queue {
        private int size;
        private long[] queArr;
        private int front;
        private int rear;
        private int nElem;

    public Queue(int size) {
        this.size = size;
        queArr = new long[size];
        front = 0;
        rear = -1;
        nElem = 0;
    }
    public void insert(long i) {
        if (isFull()) {
            throw new UnsupportedOperationException("Queue is full !");
        }

        if (rear == size - 1) {
            rear = -1;
        }

        queArr[++rear] = i;
        nElem++;
    }
    public long remove() {
        if (isEmpty()){
            throw new UnsupportedOperationException("Queue is empty !");
        }

        long temp = queArr[front++];

        if (front == size){
            front = 0;
        }
        
        nElem--;
        return temp;
    }
    public long peekFront(){
        return queArr[front];
    }
    public boolean isEmpty(){
        return (nElem == 0);
    }
    public boolean isFull(){
        return (nElem == size);
    }
    public int getSize(){
        return nElem;
    }
}
