package com.example.cxb.singletondemo;

/**
 * 懒汉式（双重校验锁，推荐用）
 * Created by xiaobocui on 2018/11/2.
 */

public class Singleton6 {

    private static volatile Singleton6 instance;// volatile关键字保证instance的可见性和有序性

    private Singleton6() {
    }

    public static Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {//锁确保了操作的原子性，可见性和有序性
                if (instance == null) instance = new Singleton6();
            }
        }
        return instance;
    }

}
