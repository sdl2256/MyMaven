package com.sun.netty.client;

import org.jboss.netty.channel.Channel;

import java.util.Scanner;

/**
 * Created by SDL on 2015/5/5.
 */
public class ClientThread extends Thread {
    private NettyClient nettyClient;
    private Scanner scanner = new Scanner(System.in);

    public void init() {
        nettyClient.init();
        nettyClient.start();
    }

    public void run() {
        while (true) {
            Channel channel = nettyClient.getChannelFuture().getChannel();
            System.out.println("发送消息（Enter发送）:");
            String msg = scanner.next();
            if (msg.equals("quit")) {
                System.out.println("wait, you will quit..");
                nettyClient.stop();
            }
            channel.write(msg);
        }
    }

    public NettyClient getNettyClient() {
        return nettyClient;
    }

    public void setNettyClient(NettyClient nettyClient) {
        this.nettyClient = nettyClient;
    }
}
