package chFourth.listing4.task5;

import chFourth.listing4.Queue;

import java.lang.reflect.Array;

public class QueueStoreApp {
    public static void main(String[] args) {

        Client client [] = new Client[5];

        for (int i = 0; i < client.length; i++){
            client[i] = new Client();
        }

        for (int j = client.length - 1; j > 0; j--){
            System.out.println(client[j].getClientID() + " "
                    + client[j].getQuantityGroceries() + " ");
            client[j].unloadCart();
        }
    }
}
