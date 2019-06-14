package com.jzf.singleton;

/**
 * 懒汉式2-->内部类实现
 *
 * @author Jia ZhiFeng <312290710@qq.com>
 * @date 2019/6/14 11:26:36
 */
public class Singleton4 {

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return Singleton4Holder.getInstace();
    }

    /**
     * 利用内部类的特性-->内部类只有在第一次使用时才初始化
     */
    private static class Singleton4Holder {
        private static final Singleton4 singleton = new Singleton4();

        private static Singleton4 getInstace() {
            return singleton;
        }
    }
}
