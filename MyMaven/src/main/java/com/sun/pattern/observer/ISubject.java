package com.sun.pattern.observer;

/**
 * Created by SDL on 2015/5/12.
 */
public interface ISubject {
    void AddObserver(IObserver obs);
    void RemoveObserver(IObserver obs);
    void Notify();
}
