package com.ljm.study.design.pattern.creational.builder;

/**
 * @author liujiaming
 */
public abstract class CourseBuilder {

    public abstract CourseBuilder buildCourseName(String courseName);

    public abstract CourseBuilder buildcoursePPT(String coursePPT);

    public abstract CourseBuilder buildvideo(String video);

    public abstract CourseBuilder buildarticle(String article);

    public abstract CourseBuilder buildQA(String QA);


    public abstract Course makeCourse();
}
