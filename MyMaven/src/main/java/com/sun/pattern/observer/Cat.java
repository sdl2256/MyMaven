package com.sun.pattern.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by SDL on 2015/5/12.
 */
public class Cat implements ISubject {

    List<IObserver> list = new ArrayList<IObserver>();

    public void AddObserver(IObserver obs) {
        list.add(obs);
    }

    public void RemoveObserver(IObserver obs) {
        list.remove(obs);
    }

    public void Notify() {
        System.out.println("Cat is crying");
        for (IObserver observer : list) {
            observer.Update();
        }
    }
}
