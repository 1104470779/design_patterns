package com.wt.study.design.pattern.creational.simplefactory;

/**
 * @ProjectName: idea
 * @Package: com.wt.study.design.pattern.creational.simplefactory
 * @Description: python产品实现
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/13 8:26 PM
 * @Version: v1.0
 */
public class PythonVideo extends Video{
    @Override
    public void produce() {
        System.out.println("python产品实现");
    }
}
