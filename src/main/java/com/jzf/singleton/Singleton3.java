package com.jzf.singleton;

/**
 * 懒汉式1-->双重检测实现
 *
 * @author Jia ZhiFeng <312290710@qq.com>
 * @date 2019/6/14 11:17:11
 */
public class Singleton3 {
    private static volatile Singleton3 singleton;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (singleton == null) {
            synchronized (Singleton3.class) {
                if (singleton == null) {
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }
}
