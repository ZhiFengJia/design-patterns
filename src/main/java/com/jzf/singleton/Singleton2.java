package com.jzf.singleton;

/**
 * 饿汉式2-->静态代码块实现
 *
 * @author Jia ZhiFeng <312290710@qq.com>
 * @date 2019/6/14 11:11:12
 */
public class Singleton2 {
    private static final Singleton2 singleton;

    static {
        singleton = new Singleton2();
    }

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return singleton;
    }
}
