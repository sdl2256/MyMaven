package com.sun.piped;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Created by SDL on 2015/4/23.
 */
public class Receiver extends Thread{
    PipedInputStream in= null;
    public PipedInputStream getPipedInputStream(){
        in = new PipedInputStream();
        return in;
    }

    @Override
    public void run() {
        byte[] bytes = new byte[1024];
        try {
            in.read(bytes);
            System.out.println("读到的信息：" + new String(bytes));
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
