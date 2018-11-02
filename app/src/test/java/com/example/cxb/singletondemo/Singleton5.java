package com.example.cxb.singletondemo;

/**
 * 懒汉式（线程安全，同步代码块）（不可用：并不能起到同步作用）
 * Created by xiaobocui on 2018/11/2.
 */

public class Singleton5 {
    private static Singleton5 instance;

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        if (instance == null) {// 这里容易产生线程不同步
            synchronized (Singleton5.class) {
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
