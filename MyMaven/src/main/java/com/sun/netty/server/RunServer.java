package com.sun.netty.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.net.NetworkInterface;

/**
 * Created by SDL on 2015/5/5.
 */
public class RunServer {
    public static void main(String[] args) {
        String contextFile = "F:\\ideaTestspace\\MyMaven\\MyMaven\\src\\main\\resources\\applicationContext.xml";
        ApplicationContext context = null;
        context = new FileSystemXmlApplicationContext(contextFile);
        final NettyServer server = (NettyServer) context.getBean("nettyServer");
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                server.stop();
            }
        });

        server.init();
        server.start();
    }
}
