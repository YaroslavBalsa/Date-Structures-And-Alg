package chFourth.listing4.task5;

import chFourth.listing4.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QueueStoreApp {
    public static void main(String[] args) throws IOException {
        String input;
        ModelQueue modelQueue = new ModelQueue();

        System.out.println("Нажми любую кнопку, чтобы добавить покупателя. ");
        System.out.println("Или нажмите Q для выхода");

        while (true){
            System.out.flush();

            input = getString();

            if (input.equals("Q") || input.equals("q")){
                break;
            }
            modelQueue.doThread(input);
        }
    }
    public static String getString() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        return string;
    }
}
