package chFourth.listing4.task5;

import chFourth.listing4.Queue;

import java.util.Timer;

public class ModelQueue {
    private String input;
    private String clientId;
    private int time;
    Queue queue1 = new Queue(10);
    Queue queue2 = new Queue(10);
    Timer timer = new Timer(true);

    public ModelQueue() {
    }

    public void addClientToQueue(String input) {

        TimerHandling tHandling = new TimerHandling();

        this.input = input;

        Client client = new Client();
        tHandling.setClientId(client.getClientID());
        time = client.getQuantityGroceries() * 1000;

        tHandling.setTime(time);

        if (queue1.getSize() > queue2.getSize()) {
            queue2.insert(client);

            tHandling.setUnload(queue2.remove());

            System.out.println("Клиент " + client.getClientID() +
                    " на кассе №2. Продуктов " + client.getQuantityGroceries());

        } else {
            queue1.insert(client);

            tHandling.setUnload(queue1.remove());

            System.out.println("Клиент " + client.getClientID() +
                    "на кассе №1. Продуктов " + client.getQuantityGroceries());

        }
        timer.schedule(tHandling, time);
    }

}

