package com.example.cxb.singletondemo;

/**
 * 饿汉式（静态代码块）
 * Created by xiaobocui on 2018/11/2.
 */

public class Singleton2 {
    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
