package com.wt.study.design.pattern.creational.builder;

/**
 * @ProjectName: idea
 * @Package: com.wt.study.design.pattern.creational.builder
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/16 11:28 PM
 * @Version: v1.0
 */
public abstract class CourseBuilder {
//
//    private String courseName;
//    private String coursePPT;
//    private String video;
//    private String article;
//    private String QA;


    public abstract  void buildCourseName(String courseName);
    public abstract  void buildcoursePPT(String coursePPT);
    public abstract  void buildvideo(String video);
    public abstract  void buildarticle(String article);
    public abstract  void buildQA(String QA);

    public abstract Course makeCourse();
}
