package com.sun.test;

/**
 * Created by SDL on 2015/4/12.
 */
public class Print99 {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++)
        {
            for (int j=1;j<=i;j++){
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
}
