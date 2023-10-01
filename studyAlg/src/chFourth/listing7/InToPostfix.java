package chFourth.listing7;

public class InToPostfix {
    private StackX stack;
    private String input;
    private String output = "";

    public InToPostfix(String input) {
        this.input = input;
        int sizeStack = input.length();
        stack = new StackX(sizeStack);
    }
    public String doTrans() {

        for (int i = 0; i < input.length(); i++){

            char ch = input.charAt(i);
            stack.displayStack("For " + ch + " ");

            switch (ch){
                case '+':
                case '-':
                    gotOperation(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOperation(ch, 2);
                    break;
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }

        while (!stack.isEmpty()){
            stack.displayStack("While ");
            output = output + stack.pop();
        }
        stack.displayStack("End   ");
        return output;
    }
    public void gotOperation (char operationThis, int prec1){

        while (!stack.isEmpty()){

            char operationTop = stack.pop();

            if (operationTop == '('){
                stack.push(operationTop);
                break;
            } else {
                int prec2;

                if (operationTop == '+' || operationTop == '-'){
                    prec2 = 1;
                } else {
                    prec2 = 2;
                }

                if (prec2 < prec1){
                    stack.push(operationTop);
                    break;
                } else {
                    output = output + operationTop;
                }
            }
        }
        stack.push(operationThis);
    }
    public void gotParen(char ch){

        while (!stack.isEmpty()){

            char chx = stack.pop();

            if (chx == '('){
                break;
            } else {
                output = output + chx;
            }
        }
    }
}
