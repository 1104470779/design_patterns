package com.ljm.study.design.pattern.creational.singleton;

/**
 * @author liujiaming
 */
public class T implements Runnable{
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+lazySingleton);

//        System.out.println(ThreadLocalInstance.getInstance());
    }
}
