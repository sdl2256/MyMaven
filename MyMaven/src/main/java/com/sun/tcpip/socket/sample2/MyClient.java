package com.sun.tcpip.socket.sample2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by SDL on 2015/4/2.
 * ������Javaֱ��ʹ��Socket�������Խ��Խ�٣���Ϊ�кܶ��ѡ���ѡ��
 * ����˵������spring�����оͿ���֧�ֺܶ���Զ�����ӵĲ�����
 * ����jboss��remotingҲ�ǲ����ѡ�񣬻���Apache��Mina�ȡ�
 */
public class MyClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 10000);

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());

            BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                String s = bufferedReader1.readLine();
                printWriter.println(s);

                printWriter.flush();

                if (s.equals("bye"))
                    break;

                System.out.println(bufferedReader.readLine());
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
