package com.socket.sample3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

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
