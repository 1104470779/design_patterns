package com.ljm.study.design.pattern.creational.singleton;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @ProjectName: study
 * @Package: com.wt.study.design.pattern.creational.singleton
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-03-15 19:33
 * @Version: v1.0
 */
public class SerializationTest {
    @Test
    public void test1() throws IOException, ClassNotFoundException {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("SingletonFile"));
        objectOutputStream.writeObject(hungrySingleton);

        File file = new File("SingletonFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newHungrySingleton =  (HungrySingleton) objectInputStream.readObject();

        System.out.println(hungrySingleton);
        System.out.println(newHungrySingleton);
        System.out.println(hungrySingleton==newHungrySingleton);

    }

    /**
     *反射破坏单例
     */
    @Test
    public void test2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {

        HungrySingleton instance = HungrySingleton.getInstance();

        Class hunguryClass = HungrySingleton.class;
        //构造器类
        Constructor constructor = hunguryClass.getDeclaredConstructor();
        //设置权限
        constructor.setAccessible(true);

        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

    }

    @Test
    public void test3() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException, NoSuchFieldException {

        LazySingleton instance = LazySingleton.getInstance();
        Field flag = instance.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(instance, true);

        Class lazySingleton = LazySingleton.class;
        Constructor constructor = lazySingleton.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazySingleton newInstance = (LazySingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);

    }
}
