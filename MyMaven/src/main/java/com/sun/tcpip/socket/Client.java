package com.sun.tcpip.socket;

import java.io.*;
import java.net.Socket;

/**
 * Created by SDL on 2015/4/2.
 */
public class Client {
    private Socket socket;
    private BufferedReader bufferedReader;
    private PrintWriter printWriter;
    private String line="";

    public Client() {
        try {
            //����Socket
            socket = new Socket("127.0.0.1",10000);
            //Socket��������
            //Ҫͨ��Socket�������ݣ�������Ҫ��ȡSocket���������OutputStream��
            printWriter = new PrintWriter(socket.getOutputStream(),true);
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            printWriter.println("hello");
            line = bufferedReader.readLine();
            System.out.println(line);

            /*
            //����flush()����ֻ�ǽ�����д�����ϵͳ�����У�������֤���ݻ���������
            OutputStream out = socket.getOutputStream();
            out.write("some data".getBytes());
            out.flush();
            out.close();
             */

            bufferedReader.close();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Client();
    }
}
