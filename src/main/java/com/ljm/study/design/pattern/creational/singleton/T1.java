package com.ljm.study.design.pattern.creational.singleton;

/**
 * @author liujiaming
 */
public class T1 implements Runnable{
    @Override
    public void run() {
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"==》"+lazyDoubleCheckSingleton);
    }
}
