package com.sun.pattern.observer;

/**
 * Created by SDL on 2015/5/12.
 */
public class Master implements IObserver {
    public void Update() {
        System.out.println("Master is waken");
    }
}
