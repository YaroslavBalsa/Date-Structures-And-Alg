package chFifth.listing4;

public class AppLinkStack {
    public static void main(String[] args) {
        LinkStack stack = new LinkStack();

        stack.push(20);
        stack.push(40);

        stack.displayStack();

        stack.push(60);
        stack.push(80);

        stack.displayStack();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.displayStack();
    }
}
