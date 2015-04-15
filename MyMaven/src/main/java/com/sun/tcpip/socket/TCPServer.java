package com.sun.tcpip.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by SDL on 2015/4/2.
 */
public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("0");
            Socket socket = serverSocket.accept();
            // ��ȡ�ͻ�������
            System.out.println("1");
            InputStream inputStream = socket.getInputStream();
            System.out.println("2");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            System.out.println("3");
            System.out.println(dataInputStream.readUTF());
            // ��ͻ����������
            System.out.println("4");
            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("Hello Client!");
            dataOutputStream.flush();
            System.out.println("5");
            dataInputStream.close();
            dataOutputStream.close();
//            socket.close();
//            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
