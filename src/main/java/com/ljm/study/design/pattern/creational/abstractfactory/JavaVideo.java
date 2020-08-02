package com.ljm.study.design.pattern.creational.abstractfactory;

/**
 * @author liujiaming
 */
public class JavaVideo extends Video{
    @Override
    public void produce() {
        System.out.println("生产java视频");
    }
}
