package com.wt.study.design.pattern.creational.singleton;

/**
 * @ProjectName: study
 * @Package: com.wt.study.design.pattern.creational.singleton
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-03-09 13:58
 * @Version: v1.0
 */
public class T1 implements Runnable{
    @Override
    public void run() {
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"==》"+lazyDoubleCheckSingleton);
    }
}
