package com.ljm.study.design.pattern.creational.factorymethod;

import com.ljm.study.BaseTest;
import org.junit.Test;

/**
 * @author liujiaming
 */
public class FactoryMethodTest {
    @Test
    public void test1(){
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }

    @Test
    public void test2(){
        VideoFactory videoFactory = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
