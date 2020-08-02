package com.ljm.study.design.pattern.creational.singleton;


import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class StaticInnerClassSingletonTest {

    @Test
    public void getInstance() {
        Thread thread1 = new Thread(new T2());
        Thread thread2 = new Thread(new T2());
        thread1.start();
        thread2.start();
        System.out.println("program finished");
    }
}
