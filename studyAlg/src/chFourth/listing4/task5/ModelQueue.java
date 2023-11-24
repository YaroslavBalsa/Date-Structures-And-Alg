package chFourth.listing4.task5;

import chFourth.listing4.Queue;

public class ModelQueue {
    private String input;
    Queue queue1 = new Queue(10);
    Queue queue2 = new Queue(10);

    public ModelQueue() {
    }

    public void addClientToQueue(String input) {

        this.input = input;

        Client client = new Client();

        if (queue1.getSize() > queue2.getSize()) {
            queue2.insert(client);

            System.out.println("Клиент " + client.getClientID() +
                    "на кассе №2. Продуктов " + client.getQuantityGroceries());
            for (int element = client.getQuantityGroceries() - 1; element > 0; element--) {
                if (element == 0) {
                    queue2.printQueue();
                }
            }
        } else {
            queue1.insert(client);

            System.out.println("Клиент " + client.getClientID() +
                    "на кассе №1. Продуктов " + client.getQuantityGroceries());
            for (int element = client.getQuantityGroceries() - 1; element > 0; element--){
                if (element == 0) {
                    queue1.printQueue();
                }
            }
        }
    }
}

