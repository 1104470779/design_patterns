package com.wt.study.design.pattern.creational.builder;

/**
 * @ProjectName: idea
 * @Package: com.wt.study.design.pattern.creational.builder
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/16 11:34 PM
 * @Version: v1.0
 */
public class CourseActualBuilder extends CourseBuilder{
    private Course course = new Course();

    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildcoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void buildvideo(String video) {
        course.setVideo(video);
    }

    @Override
    public void buildarticle(String article) {
        course.setArticle(article);
    }

    @Override
    public void buildQA(String QA) {
        course.setQA(QA);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
