package com.wt.study.design.pattern.creational.singleton;

/**
 * @ProjectName: study
 * @Package: com.wt.study.design.pattern.creational.singleton
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-03-09 14:43
 * @Version: v1.0
 */
public class StaticInnerClassSingleton {
    //静态 内部类
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

    //私有构造器 必须有
    private StaticInnerClassSingleton(){

    }
}
