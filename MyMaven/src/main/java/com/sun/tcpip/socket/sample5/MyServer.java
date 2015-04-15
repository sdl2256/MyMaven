package com.sun.tcpip.socket.sample5;

import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocketFactory;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by SDL on 2015/4/2.
 * ServerSocketFactory类来创建SSLServerSocket类实例，然后在通过SSLServerSocket来获取SSLSocket实例，
 * 这里考虑到面向对象中的面向接口编程的理念，所以代码中并没有出现SSLServerSocket和SSLSocket，
 * 而是用了他们的父类ServerSocket和Socket。
 * 在获取到ServerSocket和Socket实例以后，剩下的代码就和不使用加密方式一样了。
 *
 *下面就需要产生keystore文件了
 * keytool -genkey -alias mysocket -keyalg RSA -keystore mysocket.jks
 * 在提示输入项中，密码项自己给定，其它都不改直接回车，这里我使用的密码是“mysocket”
 * 运行Server
 * java -Djavax.net.ssl.keyStore=mysocket.jks -Djavax.net.ssl.keyStorePassword=mysocket com.sun.tcpip.socket.sample5.MyServer
 *
 * 运行Client
 * java -Djavax.net.ssl.trustStore=mysocket.jks  -Djavax.net.ssl.trustStorePassword=mysocket com.sun.tcpip.socket.sample5.MyClient
 */
public class MyServer {
    private final static Logger logger =
            Logger.getLogger(MyServer.class.getName());

    public static void main(String[] args) {
        try {
            ServerSocketFactory factory = SSLServerSocketFactory.getDefault();
            ServerSocket serverSocket = factory.createServerSocket(10000);

            while (true) {
                Socket socket = serverSocket.accept();
                invoke(socket);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void invoke(final Socket socket) {
        new Thread(new Runnable() {
            public void run() {
                ObjectInputStream is = null;
                ObjectOutputStream os = null;
                try {
                    is = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
                    os = new ObjectOutputStream(socket.getOutputStream());


                    Object obj = is.readObject();
                    User user = (User) obj;
                    System.out.println("user: " + user.getName() + "/" + user.getPassword());

                    user.setName(user.getName() + "_new");
                    user.setPassword(user.getPassword() + "_new");

                    os.writeObject(user);
                    os.flush();

                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    logger.log(Level.SEVERE, null, e);
                } finally {
                    try {
                        is.close();
                    } catch (Exception e) {
                    }
                    try {
                        os.close();
                    } catch (Exception e) {
                    }
                    try {
                        socket.close();
                    } catch (Exception e) {
                    }
                }
            }
        }).start();
    }
}
