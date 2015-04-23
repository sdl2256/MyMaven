package com.sun.sellTickets;

/**
 * Created by SDL on 2015/4/23.
 */
public class TestThread {
    public static void main(String[] args) {
        final MyData data = new MyData();
        for (int i = 0; i < 50; i++) {
            new Thread(new Runnable() {

                public void run() {
                    data.add();

                }

            }).start();
            new Thread(new Runnable() {


                public void run() {
                    data.dec();

                }

            }).start();
        }
    }
}
