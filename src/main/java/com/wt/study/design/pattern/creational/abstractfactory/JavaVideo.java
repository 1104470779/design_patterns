package com.wt.study.design.pattern.creational.abstractfactory;

/**
 * @ProjectName: idea
 * @Package: com.wt.study.design.pattern.creational.abstractfactory
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/15 9:29 PM
 * @Version: v1.0
 */
public class JavaVideo extends Video{
    @Override
    public void produce() {
        System.out.println("生产java视频");
    }
}
