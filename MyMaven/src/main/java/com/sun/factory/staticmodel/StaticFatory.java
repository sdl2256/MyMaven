package com.sun.factory.staticmodel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * 静态工厂创建一个对象  静态工厂类产生的对象一般都有共同的特性，继承某一类，或者引用接口之类，在此
 * 没有看似没有，但不可否认他们都是Object或者Object的一个子类
 * Created by SDL on 2015/5/6.
 */
public class StaticFatory {

    public static Object getInstance(String className) {
        Object instance = null;
        try {
            Class cls = Class.forName(className);
            instance = cls.newInstance();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return instance;
    }

    public static Object getInstance(String className,Object ...agrs){
        Class cls = null;
        try {
            cls = Class.forName(className);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Constructor[] constructors = cls.getConstructors();
        Object instance = null;
        for (Constructor cons:constructors) {
            Class<?>[] clses = cons.getParameterTypes();
            if (clses.length>0) {
                boolean isThisConstructor = true;
                for (int i=0;i<clses.length;i++) {
                    Class c = clses[i];
                    if (!c.isInstance(agrs[i])){
                        isThisConstructor = false;
                    }
                }
                if (isThisConstructor) {
                    try {
                        instance = cons.newInstance(agrs);
                        break;
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                } else {
                    continue;
                }
            }
        }
        return instance;
    }
}
