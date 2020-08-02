package com.ljm.study.design.pattern.creational.singleton;

/**
 * @author liujiaming
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
