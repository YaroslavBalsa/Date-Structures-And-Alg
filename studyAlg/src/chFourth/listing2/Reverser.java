package chFourth.listing2;

import chFourth.listing1.StackX;

public class Reverser {
    private String input;
    private String output;

    public Reverser(String in) {
        input = in;
    }
    public String doRevers(){
        int stackSize = input.length();
        StackX stackX = new StackX(stackSize);

        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            stackX.push(ch);
        }

        output = "";

        while (!stackX.isEmpty()){
            char ch = (char) stackX.pop();
            output = output + ch;
        }

        return output;
    }
}
