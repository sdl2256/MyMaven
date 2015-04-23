package com.sun.sellTickets;

/**
 * Created by SDL on 2015/4/23.
 */
public class DecRunnable implements Runnable{
    MyData data;

    public DecRunnable(MyData data) {
        this.data = data;
    }

    public void run() {

        data.dec();

    }
}
