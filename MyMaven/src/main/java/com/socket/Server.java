package com.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by SDL on 2015/4/2.
 */
public class Server {

    private ServerSocket serverSocket;
    private Socket socket;
    private BufferedReader bufferedReader;
    private PrintWriter printWriter;

    public Server() {
        try {
            serverSocket = new ServerSocket(10000);
            System.out.println("Server is starting....");

            socket = serverSocket.accept();

            /*
             * Socket读取数据
             * 从Socket中读取数据，我们就需要获取Socket的输入流(InputStream)
             */
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            printWriter = new PrintWriter(socket.getOutputStream(),true);

            String line = bufferedReader.readLine();
            System.out.println(line);
            printWriter.println("your word is: " + line);

            bufferedReader.close();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server();
    }
}
