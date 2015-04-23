package com.sun.piped;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by SDL on 2015/4/23.
 */
public class TestPiped {
    public static void main(String[] args) {
        Sender sender = new Sender();
        Receive receive = new Receive();

        PipedInputStream pi = receive.getPipedInputStream();
        PipedOutputStream po = sender.getPipedOutputStream();

        try {
            pi.connect(po);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        sender.start();
        receive.start();

    }
}
