package chFourth.listing1;

import chFourth.listing4.Deque;

public class StackDeque {
    private Deque arrayStack;
    private int maxSize;
    private int quantityElements;

    public StackDeque(int maxSize) {
        this.maxSize = maxSize;
        arrayStack = new Deque(maxSize);

        quantityElements = 0;
    }
    public void pushD(int e){

        arrayStack.insertLeft(e);

        quantityElements++;
    }
    public void pushR(int e){
        
        arrayStack.insertRight(e);

        quantityElements++;
    }
    public long popD (){

        quantityElements--;

        return arrayStack.removeRight();
    }
    public long popR(){

        quantityElements--;

        return arrayStack.removeLeft();
    }
    public boolean isEmpty (){
        return quantityElements == 0;
    }
    public boolean isFull (){
        return quantityElements == maxSize;
    }
    public void printStack (){
        arrayStack.printDeque();
    }
}
