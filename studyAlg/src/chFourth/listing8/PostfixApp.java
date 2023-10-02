package chFourth.listing8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostfixApp {
    public static void main(String[] args) throws IOException {
        String input;
        int output;

        while (true){
            System.out.println("Enter postfix: ");
            System.out.flush();
            input = getString();

            if (input.equals("")){
                break;
            }

            ParsePostfix parser = new ParsePostfix(input);
            output = parser.doParse();

            System.out.println("Evaluates to " + output);
        }
    }

    public static String getString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        return string;
    }
}
