package com.sun.tcpip.socket;

import java.io.IOException;
import java.net.*;

/**
 * Created by SDL on 2015/4/14.
 * UDP和TCP有两个典型的区别，一个就是它不需要建立连接，另外就是它在每次收发的报文都保留了消息的边界。
 * server端
 * 因为UDP协议不需要建立连接，它的过程如下：
 * 1. 构造DatagramSocket实例，指定本地端口。
 * 2. 通过DatagramSocket实例的receive方法接收DatagramPacket.DatagramPacket中间就包含了通信的内容。
 * 3. 通过DatagramSocket的send和receive方法来收和发DatagramPacket.
 * 典型的交互流程代码如下
 */
public class UDPServer {
    /*
    private static int ECHOMAX = 1000;

    public static void main(String[] args) {

        int servPort = 10000;
        //构建DatagramSocket实例，指定本地端口。
        try {
            DatagramSocket socket = new DatagramSocket(servPort);

            //构建需要发送的DatagramPacket报文
            DatagramPacket packet = new DatagramPacket(new byte[ECHOMAX], ECHOMAX);

            while (true) {
                //收报文
                socket.receive(packet);
                System.out.println("Handling client at " + packet.getAddress().getHostAddress()
                        + " on port " + packet.getPort());
                //发报文
                socket.send(packet);
                packet.setLength(ECHOMAX);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    */
    private byte[] buffer = new byte[1024];

    private DatagramSocket ds = null;

    private DatagramPacket packet = null;

    private InetSocketAddress socketAddress = null;

    private String orgIp;

    /**
     * 构造函数，绑定主机和端口.
     *
     * @param host 主机
     * @param port 端口
     * @throws Exception
     */
    public UDPServer(String host, int port) throws Exception {
        socketAddress = new InetSocketAddress(host, port);
        ds = new DatagramSocket(socketAddress);
        System.out.println("服务端启动!");
    }

    public final String getOrgIp() {
        return orgIp;
    }

    /**
     * 设置超时时间，该方法必须在bind方法之后使用.
     *
     * @param timeout 超时时间
     * @throws Exception
     */
    public final void setSoTimeout(int timeout) throws Exception {
        ds.setSoTimeout(timeout);
    }

    /**
     * 获得超时时间.
     *
     * @return 返回超时时间.
     * @throws Exception
     */
    public final int getSoTimeout() throws Exception {
        return ds.getSoTimeout();
    }

    /**
     * 绑定监听地址和端口.
     *
     * @param host 主机IP
     * @param port 端口
     * @throws SocketException
     */
    public final void bind(String host, int port) throws SocketException {
        socketAddress = new InetSocketAddress(host, port);
        ds = new DatagramSocket(socketAddress);
    }

    /**
     * 接收数据包，该方法会造成线程阻塞.
     *
     * @return 返回接收的数据串信息
     * @throws IOException
     */
    public final String receive() throws IOException {
        packet = new DatagramPacket(buffer, buffer.length);
        ds.receive(packet);
        orgIp = packet.getAddress().getHostAddress();
        String info = new String(packet.getData(), 0, packet.getLength());
        System.out.println("接收信息：" + info);
        return info;
    }

    /**
     * 将响应包发送给请求端.
     *
     * @throws IOException
     */
    public final void response(String info) throws IOException {
        System.out.println("客户端地址 : " + packet.getAddress().getHostAddress()
                + ",端口：" + packet.getPort());
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length, packet
                .getAddress(), packet.getPort());
        dp.setData(info.getBytes());
        ds.send(dp);
    }

    /**
     * 设置报文的缓冲长度.
     *
     * @param bufsize 缓冲长度
     */
    public final void setLength(int bufsize) {
        packet.setLength(bufsize);
    }

    /**
     * 获得发送回应的IP地址.
     *
     * @return 返回回应的IP地址
     */
    public final InetAddress getResponseAddress() {
        return packet.getAddress();
    }

    /**
     * 获得回应的主机的端口.
     *
     * @return 返回回应的主机的端口.
     */
    public final int getResponsePort() {
        return packet.getPort();
    }

    /**
     * 关闭udp监听口.
     */
    public final void close() {
        try {
            ds.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 测试方法.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String serverHost = "127.0.0.1";
        int serverPort = 10000;
        UDPServer udpServerSocket = new UDPServer(serverHost,
                serverPort);
        while (true) {
            udpServerSocket.receive();
            udpServerSocket.response("你好,KuToKu.com!");

        }
    }
}
