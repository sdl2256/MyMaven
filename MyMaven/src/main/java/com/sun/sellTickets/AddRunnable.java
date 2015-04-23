package com.sun.sellTickets;

/**
 * Created by SDL on 2015/4/23.
 */
public class AddRunnable implements Runnable {
    MyData data;

    public AddRunnable(MyData data) {
        this.data = data;
    }


    public void run() {

        data.add();


    }
}
