package chFourth.listing4.task5;

import java.awt.*;
import java.util.TimerTask;

public class TimerHandling extends TimerTask {
    private Object unload;
    private String clientId;
    private int time;
    @Override
    public void run() {
        complete();
    }
    private void complete() {
        try {

            getUnload();
            Toolkit.getDefaultToolkit().beep();
            System.out.println("Клиент " + getClientId() + " выгружен");

            Thread.currentThread().join(getTime());

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Object getUnload() {
        return unload;
    }

    public void setUnload(Object unload) {
        this.unload = unload;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
