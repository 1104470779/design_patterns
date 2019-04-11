package com.wt.study.design.pattern.creational.singleton;

/**
 * @ProjectName: study
 * @Package: com.wt.study.design.pattern.creational.singleton
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-03-04 21:43
 * @Version: v1.0
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    //私有构造器
    private LazySingleton(){
        if(lazySingleton!=null){
            throw new RuntimeException("单例模式不允许调用构造方法");
        }
    }

    public synchronized static LazySingleton getInstance(){
        synchronized (LazySingleton.class){
            //懒汉式的写法，使用的时候再创建
            if(lazySingleton==null){
                lazySingleton = new LazySingleton();
            }
            return lazySingleton;
        }

    }
}
