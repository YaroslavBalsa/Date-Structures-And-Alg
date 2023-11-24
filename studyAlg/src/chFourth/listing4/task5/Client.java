package chFourth.listing4.task5;

import chFourth.listing4.Queue;

import java.nio.charset.Charset;
import java.util.Random;

public class Client {
    private String clientID;
    private int quantityGroceries;
    private int [] pushcart;
    int count = 0;

    public Client() {

        clientID = getRandomName();

        if (getRandom() == 0){
            quantityGroceries = 1;
        } else {
            quantityGroceries = getRandom();
        }

        pushcart = new int[quantityGroceries];
        for (int i = 0; i < quantityGroceries; i++){
            pushcart[i] = count + i;
        }
    }
    private String getRandomName(){
//
//        byte[] array = new byte[7];
//        new Random().nextBytes(array);
//
//        String generationString = new String(array, Charset.forName("UTF-8"));
//

        int leftLimit = 97; // "a"
        int rightLimit = 122; //"z"
        int targetStringLength = 7;
        Random random = new Random();

        String generationString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generationString;
    }
    private int getRandom() {
        return (int) (Math.random() * 35);
    }
    public void unloadCart() {
        for (int element = getQuantityGroceries() - 1; element > 0; element--){
            System.out.print(pushcart[element] + " ");
        }
        System.out.println("");
    }
    public String getClientID() {
        return clientID;
    }
    public int getQuantityGroceries() {
        return quantityGroceries;
    }
}
