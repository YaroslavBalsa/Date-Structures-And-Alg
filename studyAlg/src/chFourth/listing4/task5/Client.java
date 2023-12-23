package chFourth.listing4.task5;

import chFourth.listing4.Queue;

import java.nio.charset.Charset;
import java.util.Random;

public class Client {
    private String clientID;
    private int quantityGroceries;
    final int min = 1;
    final int max = 10;
    private int [] pushcart;
    int count = 0;

    public Client() {

        clientID = getRandomName();
        quantityGroceries = getRandom(min, max);
        pushcart = new int[quantityGroceries];
        for (int i = 0; i < quantityGroceries; i++){
            pushcart[i] = count + i;
        }
    }
    private String getRandomName(){

        int leftLimit = 97; // "a"
        int rightLimit = 122; //"z"
        int targetStringLength = 5;
        Random random = new Random();

        String generationString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generationString;
    }
    private static int getRandom(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
    public String getClientID() {
        return clientID;
    }
    public int getQuantityGroceries() {
        return quantityGroceries;
    }
}
