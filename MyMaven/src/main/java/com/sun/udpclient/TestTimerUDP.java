package com.sun.udpclient;

/**
 * Created by SDL on 2015/4/23.
 */
public class TestTimerUDP {
    public static void main(String[] args) throws Exception {
        UDPClient client = new UDPClient();
//        new Timer
        String serverHost = "127.0.0.1";
        int serverPort = 10000;
        client.send(serverHost, serverPort, ("你好!").getBytes());
//        String info = client.receive(serverHost, serverPort);
//        System.out.println("服务端回应数据：" + info);
        client.close();
    }
}
