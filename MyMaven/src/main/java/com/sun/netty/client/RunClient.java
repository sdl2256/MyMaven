package com.sun.netty.client;

import com.sun.netty.server.NettyServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by SDL on 2015/5/5.
 */
public class RunClient {
    public static void main(String[] args) {
        String contextFile = "applicationContext.xml";
        ApplicationContext context = null;
        context = new FileSystemXmlApplicationContext(contextFile);
        ClientThread clientThread = (ClientThread) context.getBean("clientThread");

        clientThread.init();
        clientThread.start();
    }
}
