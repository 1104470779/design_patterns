package com.wt.study.design.pattern.creational.builder;

/**
 * @ProjectName: idea
 * @Package: com.wt.study.design.pattern.creational.builder
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/18 10:52 PM
 * @Version: v1.0
 */
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder){
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName,String coursePPT,String video,String article,String QA){
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildcoursePPT(coursePPT);
        courseBuilder.buildvideo(video);
        courseBuilder.buildarticle(article);
        courseBuilder.buildQA(QA);
        return courseBuilder.makeCourse();

    }
}
