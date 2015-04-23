package com.sun.udpclient;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimerTask;

/**
 * Created by SDL on 2015/4/23.
 */
public class MyTimerTask extends TimerTask {

    @Override
    public void run() {
        testTime();
        System.out.println("这是我的测试定时任务");
    }

    public void testTime() {
        //获取long型时间，毫秒值
        Date date = new Date();
        date.getTime();
        System.currentTimeMillis();
        //一、获取当前时间, 格式为: yyyy-mm-dd hh-mm-ss
        String now = DateFormat.getDateTimeInstance(2, 2, Locale.CHINESE).format(new Date());
        System.out.println(now);
        //二、获取当前时间, 格式为: yyyy年mm月dd日 上午/下午hh时mm分ss秒
        now = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.CHINESE).format(new Date());
        System.out.println(now);
        //三、获取当前时间(精确到毫秒), 格式为: yyyy-mm-dd hh:mm:ss.nnn
        now = new java.sql.Timestamp(System.currentTimeMillis()).toString();
        System.out.println(now);

        //一. 获取当前系统时间和日期并格式化输出:
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

    }
}
