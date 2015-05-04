package com.sun.tomcatlistener;

/**
 * Created by SDL on 2015/5/4.
 */
public class DemoThread implements Runnable {

    private MessageQueue mq = null;

    public DemoThread(MessageQueue mq) {
        this.mq = mq;
    }

    public void run() {
        System.out.println("DemoThread Begins.");
        while (true) {
            readFromMsgQueue();
//            System.out.println("DemoThread is running.");
        }

    }

    private Object readFromMsgQueue() {
        Object o = mq.recv();
        if (o != null)
            System.err.println(o.toString());
        return o;
    }
}
