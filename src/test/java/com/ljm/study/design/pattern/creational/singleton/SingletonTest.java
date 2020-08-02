package com.ljm.study.design.pattern.creational.singleton;

import org.junit.Test;

/**
 * @ProjectName: study
 * @Package: com.wt.study.design.pattern.creational.singleton
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-03-04 21:48
 * @Version: v1.0
 */
public class SingletonTest {
    @Test
    public void test1(){
        LazySingleton singleton = LazySingleton.getInstance();
        System.out.println("program finished");
    }

    @Test
    public void test2(){
        Thread thread1 = new Thread(new T());
        Thread thread2 = new Thread(new T());
        thread1.start();
        thread2.start();
        System.out.println("program finished");
    }
}
