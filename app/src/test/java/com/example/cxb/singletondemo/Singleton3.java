package com.example.cxb.singletondemo;

/**
 * 懒汉式（线程不安全）
 * Created by xiaobocui on 2018/11/2.
 */

public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (instance == null) instance = new Singleton3();
        return instance;
    }
}
