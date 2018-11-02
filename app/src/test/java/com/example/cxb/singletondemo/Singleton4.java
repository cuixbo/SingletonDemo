package com.example.cxb.singletondemo;

/**
 * 懒汉式（线程安全，同步方法）(不推荐用：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步)
 * Created by xiaobocui on 2018/11/2.
 */

public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {
    }

    public synchronized static Singleton4 getInstance() {
        if (instance == null) instance = new Singleton4();
        return instance;
    }

}
