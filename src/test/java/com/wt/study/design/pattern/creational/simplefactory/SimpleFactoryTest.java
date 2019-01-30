package com.wt.study.design.pattern.creational.simplefactory;

import com.wt.study.BaseTest;
import org.junit.Test;

/**
 * @ProjectName: idea
 * @Package: com.wt.study.design.pattern.creational.simplefactory
 * @Description: 简单工厂测试类
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/13 8:31 PM
 * @Version: v1.0
 */
public class SimpleFactoryTest extends BaseTest{
    @Test
    public void test(){
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(PythonVideo.class);
        video.produce();
    }

    @Test
    public void test1(){
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        video.produce();
    }

}
