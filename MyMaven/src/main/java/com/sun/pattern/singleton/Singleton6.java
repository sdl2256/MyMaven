package com.sun.pattern.singleton;

/**
 * Created by SDL on 2015/5/12.
 * 不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象，可谓是很坚强的壁垒
 *
 */
public enum Singleton6 {
    INSTANCE;
    public void whateverMothod(){}
}
