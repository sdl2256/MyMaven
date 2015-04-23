package com.sun.piped;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * Created by SDL on 2015/4/23.
 */
public class Sender extends Thread {

    PipedOutputStream out = null;

    public PipedOutputStream getPipedOutputStream() {
        out = new PipedOutputStream();
        return out;
    }

    @Override
    public void run() {
        try {
            out.write("Hello,Receiver!".getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
