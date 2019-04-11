package com.wt.study.design.pattern.creational.singleton;

import org.junit.Test;

/**
 * @ProjectName: study
 * @Package: com.wt.study.design.pattern.creational.singleton
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-03-09 13:57
 * @Version: v1.0
 */
public class LazyDoubleCheckSingletonTest {
    @Test
    public void test1(){
        Thread thread1 = new Thread(new T1());
        Thread thread2 = new Thread(new T1());
        thread1.start();
        thread2.start();
    }
}
