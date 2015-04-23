package com.sun.util;

import java.util.List;

/**
 * Created by SDL on 2015/4/17.
 */
public class ProcessDataByPostgisListeners extends ReaderFileListener{

    public ProcessDataByPostgisListeners() {
    }


    public ProcessDataByPostgisListeners(String encode) {
        setEncode(encode);
    }

    @Override
    public void output(List<String> stringList) throws Exception {
//        for (String str : stringList) {
//            System.out.println(str);
//        }
        System.out.println("线程名：" + getThreadName() + "，读到行数：" + stringList.size());
    }
}
