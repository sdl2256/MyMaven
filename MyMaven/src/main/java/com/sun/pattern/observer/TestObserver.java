package com.sun.pattern.observer;

/**
 * Created by SDL on 2015/5/12.
 */
public class TestObserver {
    public static void main(String[] args) {
        IObserver mouse = new Mouse();

        IObserver master = new Master();

        ISubject cat = new Cat();

        cat.AddObserver(mouse);

        cat.AddObserver(master);

        cat.Notify();
    }
}
