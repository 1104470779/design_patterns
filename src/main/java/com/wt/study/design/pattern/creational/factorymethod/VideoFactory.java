package com.wt.study.design.pattern.creational.factorymethod;

/**
 * @ProjectName: idea
 * @Package: com.wt.study.design.pattern.creational.simplefactory
 * @Description: 工厂方法
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/13 8:27 PM
 * @Version: v1.0
 */
public abstract class VideoFactory {
    /**
     * 定义一个规范
     * @return
     */
    public abstract Video getVideo();
}
