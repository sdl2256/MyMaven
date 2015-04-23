package com.sun.sellTickets;

/**
 * Created by SDL on 2015/4/23.
 * 优点：
 * 1.这种解法代码写的有条理，简单易读，从main中很容易整理出思路
 * 2.将数据抽象成一个类，并将对这个数据的操作作为这个类的方法，这么设计可以和容易做到同步，只要在方法上加”synchronized“
 * 不足：
 * 代码写的比较繁琐，需要有多个类，不是那么简洁
 * 个人观点：为了有条理个人比较喜欢这种写法。
 */
public class TestOne {
    public static void main(String[] args) {
        MyData data = new MyData();
        Runnable add = new AddRunnable(data);
        Runnable dec = new DecRunnable(data);
        for (int i = 0; i < 2; i++) {
            new Thread(add).start();
            new Thread(dec).start();
        }
    }
}
