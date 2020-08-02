package com.ljm.study.design.pattern.creational.singleton;

public class T2 implements Runnable {
    @Override
    public void run() {
        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+staticInnerClassSingleton);
    }
}
