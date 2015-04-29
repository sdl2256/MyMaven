package com.sun.callback;

/**
 * Created by SDL on 2015/4/28.
 * 张三实现李四规定的接口
 */
public class MethodA {
    public static void main(String args[]) {
        MethodB b = new MethodB();
        //返回值d只和MethodB有关，和接口中方法的返回值无关
        double d = b.getTime(new CallBackInterface() {

            //张三实现了李四定义的接口
            public void exectueMethod() {
                new MethodA().testMethod();
            }

            public void doSome() {

            }
        });
        System.out.println("d=" + d);
    }

    public void testMethod() {
        for (int i = 0; i < 10000; i++) {
            System.out.print("");
            System.out.println(i);
        }
    }
}
