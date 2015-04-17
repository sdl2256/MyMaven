package com.sun.thread;

/**
 * Created by SDL on 2015/4/17.
 */
public class Analy {
    public static void main(String[] args) {
        Num num = new Num(0); //新建对象，准备传递给线程
        new OwnThread(num).start();//新建线程，并启动
        new OwnThread(num).start();//新建线程，并启动
        System.out.println("主线程中i的值变为了："+num.i);    //获取目前对象i的数值
    }
}
