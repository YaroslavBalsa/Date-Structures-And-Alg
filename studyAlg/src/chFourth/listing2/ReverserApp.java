package chFourth.listing2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverserApp {
    public static void main(String[] args) throws IOException {
        String input, output;

        while (true){
            System.out.print("Enter a string: ");
            System.out.flush();

            input = getString();

            if (input.equals("")){
                break;
            }

            Reverser reverser = new Reverser(input);
            output = reverser.doRevers();

            System.out.println("Reverser: " + output);
        }
    }
    public static String getString () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        return s;
    }
}
