package com.sun.tcpip.socket.sample4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by SDL on 2015/4/2.
 */
public class MyServer {
    private final static Logger logger =
            Logger.getLogger(MyServer.class.getName());

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);

            while (true) {
                Socket socket = serverSocket.accept();
                socket.setSoTimeout(10 * 1000);
                invoke(socket);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void invoke(final Socket socket) {
        new Thread(new Runnable() {
            public void run() {
                GZIPInputStream gzipis = null;
                ObjectInputStream ois = null;
                GZIPOutputStream gzipos = null;
                ObjectOutputStream oos = null;
                try {
                    gzipis = new GZIPInputStream(socket.getInputStream());
                    ois = new ObjectInputStream(gzipis);
                    gzipos = new GZIPOutputStream(socket.getOutputStream());
                    oos = new ObjectOutputStream(gzipos);


                    Object obj = ois.readObject();
                    User user = (User) obj;
                    System.out.println("user: " + user.getName() + "/" + user.getPassword());

                    user.setName(user.getName() + "_new");
                    user.setPassword(user.getPassword() + "_new");

                    oos.writeObject(user);
                    oos.flush();
                    gzipos.finish();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    logger.log(Level.SEVERE, null, e);
                } finally {
                    try {
                        ois.close();
                    } catch (Exception e) {
                    }
                    try {
                        oos.close();
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
