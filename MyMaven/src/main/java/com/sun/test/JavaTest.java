package com.sun.test;

/**
 * Created by SDL on 2015/2/11.
 */
public class JavaTest {

    //动态密码钥匙，加密解密参数
    protected String key="100110100010100010001001";

    public static void main(String[] args )
    {
        /*
        Date date = new Date(0);
        System.out.println("new Date(0) ="+ date);
        System.out.println("new Date(-1) ="+ new Date(-1));
        System.out.println("new Date(-99999) ="+ new Date(-99999));
        */
//        String src = "zabcdefgzzsdlfhal";
//        String src = "njyouyunpolling";
        String src = "njyouyun";
        System.out.println("原始字符串为：" + src);
        JavaTest javaTest = new JavaTest();
        System.out.println("加密后字符串为：" + javaTest.enCrypt(src));
        System.out.println("解密后字符串为：" + javaTest.deCrypt(javaTest.enCrypt(src)));

    }

    /**
     * 加密
     */
    protected String enCrypt(String str) {
        if(str == null) return null;
        StringBuffer ret = new StringBuffer();
        for(int i = 0; i < str.length(); i++) {
//            System.out.println("key的长度：" + key.length());
            int k = new Integer(key.substring(i%key.length(),i%key.length() + 1));
            char c = str.charAt(i);
            char dc = (char) (c + k);
            ret.append(dc);
        }
        return ret.toString();
    }


    /**
     * 取消加密
     */
    protected String deCrypt(String str) {
        if(str == null) return null;
        StringBuffer ret = new StringBuffer();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int k = new Integer(key.substring(i%key.length(),i%key.length() + 1));
            if(c < 32 || c > 123) k = 0;
            char dc = (char) (c - k);
            ret.append(dc);
        }
        return ret.toString();
    }
}


