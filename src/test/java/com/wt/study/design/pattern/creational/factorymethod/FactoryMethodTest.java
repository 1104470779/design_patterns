package com.wt.study.design.pattern.creational.factorymethod;

import com.wt.study.BaseTest;
import org.junit.Test;

/**
 * @ProjectName: idea
 * @Package: com.wt.study.design.pattern.creational.factorymethod
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/13 8:54 PM
 * @Version: v1.0
 */
public class FactoryMethodTest extends BaseTest{
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
