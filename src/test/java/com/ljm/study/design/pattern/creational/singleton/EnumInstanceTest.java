package com.ljm.study.design.pattern.creational.singleton;

import org.junit.Test;

import java.io.*;

/**
 * @author liujiaming
 */
public class EnumInstanceTest {
    @Test
    public void test() throws IOException, ClassNotFoundException {
        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("SingletonFile"));
        objectOutputStream.writeObject(instance);

        File file = new File("SingletonFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        EnumInstance newInstance =  (EnumInstance) objectInputStream.readObject();

        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance==newInstance);
    }
}
