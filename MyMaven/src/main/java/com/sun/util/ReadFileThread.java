package com.sun.util;

/**
 * Created by SDL on 2015/4/17.
 * <p/>
 * 读文件线程
 */
public class ReadFileThread extends Thread {
    private ReaderFileListener processPoiDataListeners;
    private String filePath;
    private long start;
    private long end;

    public ReadFileThread(ReaderFileListener processPoiDataListeners, long start, long end, String file) {
        this.setName(this.getName() + "-ReadFileThread");
        this.start = start;
        this.end = end;
        this.filePath = file;
        this.processPoiDataListeners = processPoiDataListeners;
    }

    @Override
    public void run() {
        ReadFile readFile = new ReadFile();
        processPoiDataListeners.setThreadName(this.getName());
        readFile.setReaderListener(processPoiDataListeners);
        readFile.setEncode(processPoiDataListeners.getEncode());
        //ReadFile.addObserver();
        try {
            readFile.readFileByLine(filePath, start, end + 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
