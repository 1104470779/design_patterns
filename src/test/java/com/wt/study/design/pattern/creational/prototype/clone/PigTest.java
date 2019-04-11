package com.wt.study.design.pattern.creational.prototype.clone;

import com.wt.study.design.pattern.creational.singleton.HungrySingleton;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @ProjectName: study
 * @Package: com.wt.study.design.pattern.creational.prototype.clone
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-04-07 21:42
 * @Version: v1.0
 */
public class PigTest {
    @Test
    public void test1() throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Date date = new Date(0L);
        Pig pig1 = new Pig("peiqi123",date);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);
        pig1.getBirthday().setTime(666666666666L);
        System.out.println(pig1);
        System.out.println(pig2);

        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        Method clone = hungrySingleton.getClass().getDeclaredMethod("clone");
        clone.setAccessible(true);
        HungrySingleton hungrySingleton1 = (HungrySingleton) clone.invoke(hungrySingleton);
        System.out.println(hungrySingleton);
        System.out.println(hungrySingleton1);
    }
}
