package chFourth.listing8;

public class StackY {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackY(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int i){
        stackArray[++top] = i;
    }
    public int pop(){
        return stackArray[top--];
    }
    public int peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxSize - 1);
    }
    public int size(){
        return top + 1;
    }
    public int peekN(int n){
        return stackArray[n];
    }
    public void displayStack(String s){
        System.out.print(s);
        System.out.print("Stack (bottom-->top): ");

        for (int j = 0; j < size(); j++){
            System.out.print(peekN(j));
            System.out.print(' ');
        }
        System.out.println("");
    }
}
