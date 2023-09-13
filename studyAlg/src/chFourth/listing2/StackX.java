package chFourth.listing2;

public class StackX {
    private char[] stackArr;
    private int maxSize;
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArr = new char[s];
        top = -1;
    }
    public void push(char value){
        stackArr[++top] = value;
    }
    public char pop(){
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
