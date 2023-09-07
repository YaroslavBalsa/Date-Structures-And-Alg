package chFourth.listing2;

public class StackX {
    private long [] stackArr;
    private int maxSize;
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArr = new long[s];
        top = -1;
    }
    public void push(int value){
        stackArr[++top] = value;
    }
    public long pop(){
        return stackArr[top--];
    }
    public long peek(){
        return stackArr[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxSize - 1);
    }
}
