package com.wt.study.design.pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: study
 * @Package: com.wt.study.design.pattern.creational.singleton
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-03-21 23:20
 * @Version: v1.0
 */
public class ContainerSingleton {
    private ContainerSingleton(){

    }

    private static Map<String,Object> container = new HashMap();

    public static void putInstance(String key,Object instance){
        if(key!=null&&key!=""&&instance!=null){
            if(!(container.containsKey(key))){
                container.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key){
        return container.get(key);
    }
}
