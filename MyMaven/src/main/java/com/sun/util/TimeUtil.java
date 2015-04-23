package com.sun.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by SDL on 2015/4/23.
 */
public class TimeUtil {
    public static long getCurrentTime() {
        //获取long型时间，毫秒值
        //return System.currentTimeMillis();
        Date date = new Date();
        return date.getTime();

    }

    public static String getCurrentFormatTime() {
        //一、获取当前时间, 格式为: yyyy-mm-dd hh-mm-ss
        //一. 获取当前系统时间和日期并格式化输出:
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        return df.format(new Date());// new Date()为获取当前系统时间
    }

    public static String getCurrentChineseTime() {
        String now = DateFormat.getDateTimeInstance(2, 2, Locale.CHINESE).format(new Date());
        return now;
        //二、获取当前时间, 格式为: yyyy年mm月dd日 上午/下午hh时mm分ss秒
        //now=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG,Locale.CHINESE). format(new Date() );
    }

    public static String getCurrentFormatMillTime() {
        //三、获取当前时间(精确到毫秒), 格式为: yyyy-mm-dd hh:mm:ss.nnn
        String now = new java.sql.Timestamp(System.currentTimeMillis()).toString();
        return now;
    }

}
