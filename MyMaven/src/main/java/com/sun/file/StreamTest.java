package com.sun.file;

import java.io.*;

class StreamTest {
    public static void main(String[] args) throws Exception {
        /*int data;
        while((data=System.in.read())!=-1)
		{
			System.out.write(data);
		}*/

		/*FileOutputStream fos=new FileOutputStream("1.txt");
        //fos.write("http://www.mybole.com.cn".getBytes());
		//fos.close();
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		//bos.write("http://www.mybole.com.cn".getBytes());
		//bos.flush();
		//bos.close();
		DataOutputStream dos=new DataOutputStream(bos);
		
		byte b=3;
		int i=78;
		char ch='a';
		float f=4.5f;
		dos.writeByte(b);
		dos.writeInt(i);
		dos.writeChar(ch);
		dos.writeFloat(f);
		dos.close();
		FileInputStream fis=new FileInputStream("1.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);*/
		/*byte[] buf=new byte[100];
		//int len=fis.read(buf);
		int len=bis.read(buf);
		System.out.println(new String(buf,0,len));
		//fis.close();
		bis.close();*/
		/*DataInputStream dis=new DataInputStream(bis);
		System.out.println(dis.readByte());
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readFloat());
		dis.close();*/

        FileOutputStream fos = new FileOutputStream("1.txt", true);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        for (int i = 0; i < 10; i++) {
            bw.write("http://www.mybole.com.cn\n");
        }
        bw.close();
		/*
		FileInputStream fis=new FileInputStream("1.txt");
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(isr);
		System.out.println(br.readLine());
		br.close();*/

		/*
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String strLine;
		while((strLine=br.readLine())!=null)
		{
			System.out.println(strLine);
		}
		br.close();
		*/
    }
}