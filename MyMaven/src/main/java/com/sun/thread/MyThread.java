package com.sun.thread;

/**
 * Created by SDL on 2015/4/27.
 */
public class MyThread extends Thread {

    @Override

    public void run() {

        System.out.println(Thread.currentThread().getName() + "正在执行。。。");

    }
}
