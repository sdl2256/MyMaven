package com.sun.udpclient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by SDL on 2015/4/14.
 * client端
 *
 * UDP客户端的步骤也比较简单，主要包括下面3步：
 * 1. 构造DatagramSocket实例。
 * 2.通过DatagramSocket实例的send和receive方法发送DatagramPacket报文。
 * 3.结束后，调用DatagramSocket的close方法关闭。
 */
public class UDPClient {

    private byte[] buffer = new byte[1024];

    private static final int TIMEOUT = 6000;

    private DatagramSocket ds = null;


    /**
     * 构造函数，创建UDP客户端
     *
     * @throws SocketException
     */
    public UDPClient() throws SocketException {
        ds = new DatagramSocket();
    }

    /**
     * 设置超时时间，该方法必须在bind方法之后使用.
     *
     * @param timeout
     *            超时时间
     * @throws Exception
     */
    public final void setSoTimeout(final int timeout) throws Exception {
        ds.setSoTimeout(timeout);
    }

    /**
     * 获得超时时间.
     *
     * @return 返回超时时间
     * @throws Exception
     */
    public final int getSoTimeout() throws Exception {
        return ds.getSoTimeout();
    }

    public final DatagramSocket getSocket() {
        return ds;
    }

    /**
     * 向指定的服务端发送数据信息.
     *
     * @param host 服务器主机地址
     * @param port 服务端端口
     * @param bytes 发送的数据信息
     * @return 返回构造后俄数据报
     * @throws IOException
     */
    public final DatagramPacket send(final String host, final int port,
                                     final byte[] bytes) throws IOException {
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress
                .getByName(host), port);
        ds.send(dp);
        return dp;
    }

    /**
     * 接收从指定的服务端发回的数据.
     *
     * @param lhost
     *            服务端主机
     * @param lport
     *            服务端端口
     * @return 返回从指定的服务端发回的数据.
     * @throws Exception
     * @author
     */
    public final String receive(final String lhost, final int lport)
            throws Exception {
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
        ds.receive(dp);
        String info = new String(dp.getData(), 0, dp.getLength());
        return info;
    }


    /**
     * 关闭udp连接.
     *
     */
    public final void close() {
        try {
            ds.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        UDPClient client = new UDPClient();
        String serverHost = "127.0.0.1";
        int serverPort = 10000;
        client.send(serverHost, serverPort, ("你好!").getBytes());
        String info = client.receive(serverHost, serverPort);
        System.out.println("服务端回应数据：" + info);
        client.close();
    }
}
