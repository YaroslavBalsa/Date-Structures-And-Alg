package chFourth.listing4;

public class Queue {
        private int size;
        private Object[] queArr;
        private int front;
        private int rear;
        private int nElem;

    public Queue() {
    }

    public Queue(int size) {
        this.size = size;
        queArr = new Object[size];
        front = 0;
        rear = -1;
        nElem = 0;
    }
    public void insert(Object i) {
        if (isFull()) {
            throw new UnsupportedOperationException("Queue is full !");
        }

        if (rear == size - 1) {
            rear = -1;
        }

        queArr[++rear] = i;
        nElem++;
    }
    public Object remove() {
        if (isEmpty()){
            throw new UnsupportedOperationException("Queue is empty !");
        }

        Object temp = queArr[front++];

        if (front == size){
            front = 0;
        }
        
        nElem--;
        return temp;
    }
    public Object peekFront(){
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
    public void printQueue(){

        if (isEmpty()){
            throw new UnsupportedOperationException("Queue is empty !");
        }

        while (!isEmpty()){
            Object element = remove();
            System.out.print(element + " ");
        }
        System.out.println("");
    }
}
