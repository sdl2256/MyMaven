package com.sun.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by SDL on 2015/4/23.
 */
public class TimerUtil {
    // 第一种方法：设定指定任务task在指定时间time执行 schedule(TimerTask task, Date time)
    public static void scheduleTimer(TimerTask timerTask, Date time) {
        Timer timer = new Timer();
        timer.schedule(timerTask, time);// 设定指定的时间time,此处为2000毫秒
    }

    // 第二种方法：设定指定任务task在指定延迟delay后进行固定延迟peroid的执行
    // schedule(TimerTask task, long delay, long period)
    public static void scheduleTimer(TimerTask timerTask, long delay, long period) {
        Timer timer = new Timer();
        timer.schedule(timerTask, delay, period);
    }

    // 第二种方法：设定指定任务task在指定延迟delay后进行固定延迟peroid的执行
    // schedule(TimerTask task, long delay, long period)
    public static void timer(TimerTask task, long delay, long period) {
        Timer timer = new Timer();
        timer.schedule(task, delay, period);
    }

    // 第三种方法：设定指定任务task在指定延迟delay后进行固定频率peroid的执行。
    // scheduleAtFixedRate(TimerTask task, long delay, long period)
    public static void scheduleAtFixedRateTimer(TimerTask task, long delay, long period) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, delay, period);
    }

    // 第四种方法：安排指定的任务task在指定的时间firstTime开始进行重复的固定速率period执行．
    // Timer.scheduleAtFixedRate(TimerTask task,Date firstTime,long period)
    public static void scheduleAtFixedRateTimer(TimerTask task, Date firstTime, long period) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 12); // 控制时
        calendar.set(Calendar.MINUTE, 0);       // 控制分
        calendar.set(Calendar.SECOND, 0);       // 控制秒

        if (firstTime == null)
            firstTime = calendar.getTime();         // 得出执行任务的时间,此处为今天的12：00：00
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, firstTime, period);// 这里设定将延时每天固定执行 1000 * 60 * 60 * 24
    }

    public static void main(String[] args) {
//        timer1();
//        timer2();
//        timer3();
//        timer4();
//        timer(new MyTimerTask(), 1000, 5000);
    }
}
