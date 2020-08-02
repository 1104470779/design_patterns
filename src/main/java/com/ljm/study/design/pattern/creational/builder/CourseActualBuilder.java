package com.ljm.study.design.pattern.creational.builder;

/**
 * @author liujiaming
 */
public class CourseActualBuilder extends  CourseBuilder{
    private Course course = new Course();

    @Override
    public CourseBuilder buildCourseName(String courseName) {
        course.setCourseName(courseName);
        return this;
    }

    @Override
    public CourseBuilder buildcoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
        return this;
    }

    @Override
    public CourseBuilder buildvideo(String video) {
        course.setVideo(video);
        return this;
    }

    @Override
    public CourseBuilder buildarticle(String article) {
        course.setArticle(article);
        return this;
    }

    @Override
    public CourseBuilder buildQA(String QA) {
        course.setQA(QA);
        return this;
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
