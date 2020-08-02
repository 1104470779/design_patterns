package com.ljm.study.design.pattern.creational.singleton;

/**
 * @author liujiaming
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    //私有构造器
    private LazySingleton() {
        if (lazySingleton != null) {
            throw new RuntimeException("单例模式不允许调用构造方法");
        }
    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static LazySingleton getInstance2() {
        synchronized (LazySingleton.class) {
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
     }
}
