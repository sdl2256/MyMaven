package com.sun.tomcatlistener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by SDL on 2015/5/4.
 */
public class MyListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.err.println("DBConnListener Startup!");
        DemoThread dt = new DemoThread(MessageQManager.mq);
        Thread th1 = new Thread(dt);
        th1.start();
        System.err.println("DemoThread Startup!");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
