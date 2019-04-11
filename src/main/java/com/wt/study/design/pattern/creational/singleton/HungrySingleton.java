package com.wt.study.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @ProjectName: study
 * @Package: com.wt.study.design.pattern.creational.singleton
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-03-09 15:01
 * @Version: v1.0
 */
public class HungrySingleton implements Serializable ,Cloneable{
    //在类加载得时候就初始化
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        if(hungrySingleton!=null){
            throw new RuntimeException("单例构造器禁止反射调用！");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
