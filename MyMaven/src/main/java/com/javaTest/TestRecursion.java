package com.javaTest;

/**
 * Created by SDL on 2015/4/12.
 */
public class TestRecursion {
    static int a = 0;
    public static void test01() {

        a++;
        System.out.println("test01:"+a);
        if(a<=10){  //递归头
            test01();
        }else{      //递归体
            System.out.println("over");
        }
    }

    public static long factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }


    public static void main(String[] args) {
        test01();
        long res = factorial(5);
        System.out.println(res);
    }
}
