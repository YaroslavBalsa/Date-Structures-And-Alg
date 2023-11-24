package chFourth.listing4.task5;

import chFourth.listing4.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QueueStoreApp {
    public static void main(String[] args) throws IOException {
        String input;
        ModelQueue modelQueue = new ModelQueue();

        while (true){
            System.out.println("Нажми любую кнопку, чтобы добавить покупателя. ");
            System.out.println("Или нажмите Q для выхода");
            System.out.flush();

            input = getString();

            if (input.equals("Q") || input.equals("q")){
                break;
            }

            modelQueue.addClientToQueue(input);
        }

//        Client client [] = new Client[5];
//
//        for (int i = 0; i < client.length; i++){
//            client[i] = new Client();
//        }
//
//        for (int j = client.length - 1; j > 0; j--){
//            System.out.println(client[j].getClientID() + " "
//                    + client[j].getQuantityGroceries() + " ");
//            client[j].unloadCart();
//        }
    }
    public static String getString() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        return string;
    }
}
