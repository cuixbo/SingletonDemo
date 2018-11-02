package com.example.cxb.singletondemo;

/**
 * 静态内部类(优点：避免了线程不安全，延迟加载，效率高。)
 * 饿汉式Singleton类被装载就会实例化，没有Lazy-Loading的作用。
 * 而静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，
 * 才会装载SingletonInstance类，从而完成Singleton的实例化。
 * Created by xiaobocui on 2018/11/2.
 */
public class Singleton7 {
    private Singleton7() {
    }

    public static Singleton7 getInstance() {
        return SingletonInstance.INSTANCE;
    }

    private static class SingletonInstance {
        private static final Singleton7 INSTANCE = new Singleton7();
    }
}
