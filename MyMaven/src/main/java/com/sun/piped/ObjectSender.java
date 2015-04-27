package com.sun.piped;

import com.sun.serializable.Person;

import java.io.*;

/**
 * Created by SDL on 2015/4/24.
 */
public class ObjectSender extends Thread{

    ObjectOutputStream objectOutputStream = null;

    PipedOutputStream pipedOutputStream = null;

    public ObjectSender() throws IOException {
        pipedOutputStream = new PipedOutputStream();
        objectOutputStream = new ObjectOutputStream(pipedOutputStream);
    }

    @Override
    public void run() {
        try {
            Person person = new Person();
            person.setId(111);
            person.setName("222");
            objectOutputStream.writeObject(person);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public PipedOutputStream getPipedOutputStream() {
        return pipedOutputStream;
    }
}
