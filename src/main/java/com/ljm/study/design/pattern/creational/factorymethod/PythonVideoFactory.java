package com.ljm.study.design.pattern.creational.factorymethod;

/**
 * @author liujiaming
 */
public class PythonVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
