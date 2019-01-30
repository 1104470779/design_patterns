package com.wt.study.design.pattern.creational.simplefactory;

/**
 * @ProjectName: idea
 * @Package: com.wt.study.design.pattern.creational.simplefactory
 * @Description: java产品实现
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/13 8:25 PM
 * @Version: v1.0
 */
public class JavaVedio extends Video{
    @Override
    public void produce() {
        System.out.println("录制java视频");
    }
}
