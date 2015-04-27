package com.sun.file;

import com.sun.util.TimeUtil;
import com.sun.util.TimerUtil;
import org.apache.log4j.Logger;

import javax.annotation.PreDestroy;
import java.io.*;
import java.util.TimerTask;

/**
 * Created by SDL on 2015/4/23.
 */
public class TimerInputTask extends TimerTask {
    public static Logger logger = Logger.getLogger(TimerInputTask.class);

//    FileOutputStream fos = null;
//    OutputStreamWriter osw = null;
//    BufferedWriter bw = null;
//
//    public TimerInputTask() {
//        try {
//            fos = new FileOutputStream("times.txt", true);
//            osw = new OutputStreamWriter(fos);
//            bw = new BufferedWriter(osw);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

    @Override
    public void run() {

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("times.txt", true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        try {
            bw.write(TimeUtil.getCurrentFormatTime() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//
//    @PreDestroy
//    public void destroyMed() throws IOException {
//        bw.close();
//    }


    public static void main(String[] args) {
        TimerUtil.scheduleAtFixedRateTimer(new TimerInputTask(), 2000, 1000);
    }
}
