package com.ljm.study.design.pattern.creational.simplefactory;

/**
 * @author liujiaming
 */
public class JavaVedio extends Video{
    @Override
    public void produce() {
        System.out.println("录制java视频");
    }
}
