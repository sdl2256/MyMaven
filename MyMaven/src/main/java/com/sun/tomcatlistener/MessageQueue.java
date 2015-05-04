package com.sun.tomcatlistener;

import java.util.Vector;

/**
 * Created by SDL on 2015/5/4.
 */
public class MessageQueue {
    private Vector<Object> queue = null;
    public MessageQueue() {
        queue = new Vector<Object>();
    }

    public synchronized void send(Object o) {
        queue.addElement(o);
    }

    public synchronized Object recv() {
        if (queue.size() == 0)
            return null;
        Object o = queue.firstElement();
        queue.removeElementAt(0);
        return o;
    }
}
