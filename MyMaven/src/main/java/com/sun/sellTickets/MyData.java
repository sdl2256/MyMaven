package com.sun.sellTickets;

/**
 * Created by SDL on 2015/4/23.
 * 内部类共享外部类数据的思想，即把要共享的数据变得全局变量
 */
public class MyData {
    private int j = 0;

    public synchronized void add() {
        j++;
        System.out.println("加1线程" + Thread.currentThread().getName() + " j为：" + j);
    }

    public synchronized void dec() {
        j--;
        System.out.println("减1线程" + Thread.currentThread().getName() + " j为：" + j);
    }

    public int getData() {
        return j;
    }
}
