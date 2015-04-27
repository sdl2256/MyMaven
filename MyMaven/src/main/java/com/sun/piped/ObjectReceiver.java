package com.sun.piped;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;

/**
 * Created by SDL on 2015/4/23.
 */
public class ObjectReceiver extends Thread{
    PipedInputStream in= null;
    ObjectInputStream objectInputStream = null;
    private PipedInputStream pipedInputStream;


    public ObjectReceiver() throws IOException {
        in = new PipedInputStream();
        objectInputStream = new ObjectInputStream(in);
    }

    @Override
    public void run() {
        byte[] bytes = new byte[1024];
        try {
            Object o = objectInputStream.readObject();

            System.out.println("读到的信息：" + o.toString());
            objectInputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public PipedInputStream getPipedInputStream() {
        return pipedInputStream;
    }
}
