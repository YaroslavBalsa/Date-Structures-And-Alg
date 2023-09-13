package chFourth.listing3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketsApp {
    public static void main(String[] args) throws IOException {
        String input;
        while (true){
            System.out.println("Enter a string: ");
            System.out.flush();
            input = getString();

            if (input.equals("")){
                break;
            }

            BracketChecker checker = new BracketChecker(input);
            checker.check();
        }
    }
    public static String getString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        return s;
    }
}
