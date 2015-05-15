package com.sun.pattern.observer;

/**
 * Created by SDL on 2015/5/12.
 */
public class Mouse implements IObserver {
    public void Update() {
        System.out.println("Mouse is escaped");
    }
}
