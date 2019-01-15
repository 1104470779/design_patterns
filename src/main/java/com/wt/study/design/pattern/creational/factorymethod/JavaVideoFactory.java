package com.wt.study.design.pattern.creational.factorymethod;

/**
 * @ProjectName: idea
 * @Package: com.wt.study.design.pattern.creational.factorymethod
 * @Description: java视频工厂
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/13 8:47 PM
 * @Version: v1.0
 */
public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVedio();
    }
}
