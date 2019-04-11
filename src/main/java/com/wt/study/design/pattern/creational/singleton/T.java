package com.wt.study.design.pattern.creational.singleton;

/**
 * @ProjectName: study
 * @Package: com.wt.study.design.pattern.creational.singleton
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-03-04 21:54
 * @Version: v1.0
 */
public class T implements Runnable{
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println(Thread.currentThread().getName()+" "+lazySingleton);

        System.out.println(ThreadLocalInstance.getInstance());
    }
}
