package com.socket.sample1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by SDL on 2015/4/2.
 * 现在做Java直接使用Socket的情况是越来越少，因为有很多的选择可选，
 * 比如说可以用spring，其中就可以支持很多种远程连接的操作，
 * 另外jboss的remoting也是不错的选择，还有Apache的Mina等。
 */
public class MyClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 10000);

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
