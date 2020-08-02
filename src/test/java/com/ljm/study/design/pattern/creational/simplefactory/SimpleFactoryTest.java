package com.ljm.study.design.pattern.creational.simplefactory;

import com.ljm.study.BaseTest;
import org.junit.Test;

/**
 * @author liujiaming
 */
public class SimpleFactoryTest {

    @Test
    public void test_0(){
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(PythonVideo.class);
        video.produce();
    }

    @Test
    public void test_1(){
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        video.produce();
    }

}
