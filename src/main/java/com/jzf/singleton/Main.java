package com.jzf.singleton;

/**
 * 测试用例
 *
 * @author Jia ZhiFeng <312290710@qq.com>
 * @date 2019/6/14 13:50:08
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Singleton1.getInstance().hashCode())).start();
//            new Thread(() -> System.out.println(Singleton2.getInstance().hashCode())).start();
//            new Thread(() -> System.out.println(Singleton3.getInstance().hashCode())).start();
//            new Thread(() -> System.out.println(Singleton4.getInstance().hashCode())).start();
//            new Thread(() -> System.out.println(Singleton5.getInstance().hashCode())).start();
        }
    }
}
