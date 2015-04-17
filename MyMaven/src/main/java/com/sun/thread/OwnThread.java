package com.sun.thread;

/**
 * Created by SDL on 2015/4/17.
 */
public class OwnThread extends Thread {
    Num id;    //申明对象，默认null，就是没有指向任何实体
    int sno;    //申明int变量。因为系统默认初始化为0，所以应该是定义一个int变量

    OwnThread(Num id) {
        this.id = id;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (this) {
                sno = id.i;    //保存id.i的数值，到线程私有变量sno
                id.i++;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                }
            }
            System.out.println(this.getName() + "," + sno);
        }
    }
}
