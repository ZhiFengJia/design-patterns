package com.jzf.singleton;

/**
 * 懒汉式3-->枚举实现
 *
 * @author Jia ZhiFeng <312290710@qq.com>
 * @date 2019/6/14 11:32:36
 */
public enum Singleton5 {
    INSTANCE;

    public static Singleton5 getInstance() {
        return INSTANCE;
    }
}
