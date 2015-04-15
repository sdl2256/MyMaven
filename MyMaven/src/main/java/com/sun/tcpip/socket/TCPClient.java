package com.sun.tcpip.socket;

import java.io.*;
import java.net.Socket;

/**
 * Created by SDL on 2015/4/2.
 */
public class TCPClient {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost",8888);
            // ��������˷�������
            OutputStream outputStream = socket.getOutputStream();

            System.out.println(1);
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            dataOutputStream.writeUTF("Hello Server!");
            System.out.println("2");
            dataOutputStream.flush();
            System.out.println("3");
            // ���շ�����������
            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            String s = dataInputStream.readUTF();
            System.out.println(s);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
