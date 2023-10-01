package chFourth.listing7;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfixApp {
    public static void main(String[] args) throws IOException {

        String input, output;

        while (true){
            System.out.println("Enter infix: ");
            System.out.flush();
            input = getString();

            if (input.equals("")){
                break;
            }

            InToPostfix trans = new InToPostfix(input);
            output = trans.doTrans();

            System.out.println("Postfix is " + output + '\n');
        }
    }

    public static String getString() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        return string;
    }
}
