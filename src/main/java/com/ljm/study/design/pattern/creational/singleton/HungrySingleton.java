package com.ljm.study.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @author liujiaming
 */
public class HungrySingleton implements Serializable {
    //在类加载得时候就初始化
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        if(hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }

}
