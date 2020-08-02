package com.ljm.study.design.pattern.creational.abstractfactory;

/**
 * @author liujiaming
 */
public class PythonCourceFactory implements CourseFactory{
    @Override
    public Video getVedio() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
