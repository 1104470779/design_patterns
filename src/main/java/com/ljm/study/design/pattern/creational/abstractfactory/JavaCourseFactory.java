package com.ljm.study.design.pattern.creational.abstractfactory;

/**
 * @author liujiaming
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVedio() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
