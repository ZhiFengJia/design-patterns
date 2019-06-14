package com.jzf.singleton;

/**
 * 饿汉式1-->简单new方式实现
 *
 * @author Jia ZhiFeng <312290710@qq.com>
 * @date 2019/6/14 11:11:12
 */
public class Singleton1 {
    private static final Singleton1 singleton = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return singleton;
    }
}
