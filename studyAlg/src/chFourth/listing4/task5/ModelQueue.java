package chFourth.listing4.task5;

import chFourth.listing4.Queue;

import java.util.Timer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ModelQueue {
    private String input;
    Queue queue1 = new Queue(10);
    Queue queue2 = new Queue(10);
    Timer timer = new Timer(true);

    public ModelQueue() {
    }
    public void doThread(String input) {
        Lock lock = new ReentrantLock();
        Condition doNext = lock.newCondition();
        this.input = input;

        lock.lock();
        try {
            addClientToQueue();
        } finally {
            lock.unlock();
        }
    }

    public void addClientToQueue() {

        TimerHandling tHandling = new TimerHandling();

        Client client = new Client();

        tHandling.setClientId(client.getClientID());
        int time = client.getQuantityGroceries() * 1000;

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
                    " на кассе №1. Продуктов " + client.getQuantityGroceries());
        }
        timer.schedule(tHandling, time);
    }
}

