package com.sun.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by SDL on 2015/4/17.
 *
 * 线程调度
 */
public class BuildData extends GetTime{

    @Override
    public void runcode() {
        File file = new File("F:\\ideaTestspace\\UDPClientSim\\src\\main\\resources\\shipInfo.txt");
        FileInputStream fis = null;
        try {
            ReadFile readFile = new ReadFile();
            fis = new FileInputStream(file);
            int available = fis.available();
            System.out.println("文件大小："+available);
            int maxThreadNum = 20;
            // 线程粗略开始位置
            int i = available / maxThreadNum;
            for (int j = 0; j < maxThreadNum; j++) {
                // 计算精确开始位置
                long startNum = j == 0 ? 0 : readFile.getStartNum(file, i * j);
                long endNum = j + 1 < maxThreadNum ? readFile.getStartNum(file, i * (j + 1)) : -2;
                // 具体监听实现
                ProcessDataByPostgisListeners listeners = new ProcessDataByPostgisListeners("UTF-8");
                ReadFileThread thread = new ReadFileThread(listeners, startNum, endNum, file.getPath());
                thread.start();
                thread.join();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        new BuildData().getTime();//建立对象调用getTime();
    }
}
