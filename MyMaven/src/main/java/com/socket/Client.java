package com.socket;

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
            //创建Socket
            socket = new Socket("127.0.0.1",10000);
            //Socket发送数据
            //要通过Socket发送数据，我们需要获取Socket的输出流（OutputStream）
            printWriter = new PrintWriter(socket.getOutputStream(),true);
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            printWriter.println("hello");
            line = bufferedReader.readLine();
            System.out.println(line);

            /*
            //调用flush()方法只是将数据写入操作系统缓存中，并不保证数据会立即发送
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
