package com.ljm.study.design.pattern.creational.factorymethod;

/**
 * @author liujiaming
 */
public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVedio();
    }
}
