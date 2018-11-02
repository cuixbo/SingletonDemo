package com.example.cxb.singletondemo;

/**
 * 饿汉式
 * Created by xiaobocui on 2018/11/2.
 */
public class Singleton1 {
    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {}

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}
